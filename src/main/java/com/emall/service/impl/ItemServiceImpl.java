package com.emall.service.impl;

import com.emall.dao.*;
import com.emall.dataobject.*;
import com.emall.error.BusinessException;
import com.emall.response.CommonReturnType;
import com.emall.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by chaikai on 2019/01/15
 */
@Service("ItemService")
@Slf4j
public class ItemServiceImpl implements ItemService {

    private static final int TOP_SALES_NUMBER = 4;

    @Autowired
    private ItemDOMapper itemDOMapper;

    @Autowired
    private ItemAttrKeyDOMapper itemAttrKeyDOMapper;

    @Autowired
    private ItemAttrValDOMapper itemAttrValDOMapper;

    @Autowired
    private ItemStockDOMapper itemStockDOMapper;

    @Autowired
    private BuyerCommentDOMapper buyerCommentDOMapper;

    /**
     *
     * @param currPage 第几页
     * @param pageSize 每页的商品数
     * @return CommonReturnType
     * @throws BusinessException
     */
    @Override
    public CommonReturnType getItemList(int currPage, int pageSize) throws BusinessException {
        Map<String,Object> data = new HashMap<>();
        data.put("currIndex",(currPage-1)*pageSize);
        data.put("pageSize",pageSize);
        List<ItemDO> itemDOS = itemDOMapper.getItems(data);
        List<GoodsListDO> goodsListDOS = new ArrayList<>();
        for(int i = 0; i < itemDOS.size(); i++){
            GoodsListDO goodsListDO = new GoodsListDO();
            String itemId = itemDOS.get(i).getItemId();
            goodsListDO.setItemId(itemId);
            goodsListDO.setImg(itemDOS.get(i).getItemMainImage());
            goodsListDO.setIntro(itemDOS.get(i).getItemTitle());
            goodsListDO.setRemarks(buyerCommentDOMapper.getCommentCount(itemId));
            goodsListDO.setPrice(itemStockDOMapper.getMinPrice(itemId));
            goodsListDOS.add(goodsListDO);
        }
        return CommonReturnType.create(goodsListDOS);
    }

    /**
     *
     * @param itemId 商品的ID（雪花码）
     * @return  CommonReturnType
     * @throws BusinessException
     */
    @Override
    public CommonReturnType getItemDetil(String itemId) throws BusinessException {
        ItemDO itemDO = itemDOMapper.selectByPrimaryKey(itemId);
        ItemShowDO itemShowDO = new ItemShowDO();
        itemShowDO.setItemId(itemId);
        itemShowDO.setItemTitle(itemDO.getItemTitle());
        itemShowDO.setItemSales(itemDO.getItemSales());
        itemShowDO.setItemDetailImage(itemDO.getItemDetailImage());
        itemShowDO.setItemIntroImage(itemDO.getItemIntroImage());
        itemShowDO.setMeal(getMeal(itemId));
        itemShowDO.setTopSales(getTopSales(ItemServiceImpl.TOP_SALES_NUMBER));
        return CommonReturnType.create(itemShowDO);
    }

    /**
     *
     * @param itemId 商品的id
     * @param symbol 属性标签集合
     * @return CommonReturnType
     * @throws BusinessException
     */
    @Override
    public CommonReturnType getItemPriceAndStock(String itemId, String symbol) throws BusinessException {
        Map<String,String> map = new HashMap<>();
        map.put("itemId",itemId);
        map.put("symbol",symbol);
        return CommonReturnType.create(itemStockDOMapper.selectByItemIdAndSymbol(map));
    }

    /**
     *
     * @param number 热销商品的数量
     * @return CommonReturnType
     * @throws BusinessException
     */
    public List<ItemDO> getTopSales(int number) throws BusinessException{
        return itemDOMapper.getTopSails(number);
    }

    /**
     *
     * @param itemId 商品的id
     * @return List<MealDO> 返回商品的属性列表
     * @throws BusinessException
     */
    public List<MealDO> getMeal(String itemId) throws BusinessException{
        List<ItemAttrKeyDO> itemAttrKeyDOS = itemAttrKeyDOMapper.selectByItemId(itemId);
        List<MealDO> mealDOS = new ArrayList<>() ;
        for(int i = 0; i < itemAttrKeyDOS.size(); i++){
            MealDO mealDO = new MealDO();
            int attrKeyId = itemAttrKeyDOS.get(i).getAttrKeyId();
            mealDO.setAttrId(attrKeyId);
            mealDO.setItemId(itemAttrKeyDOS.get(i).getItemId());
            mealDO.setAttrName(itemAttrKeyDOS.get(i).getAttrName());
            List<ItemAttrValDO> itemAttrValDOS = itemAttrValDOMapper.selectByAttrKeyId(attrKeyId);
            mealDO.setValue(itemAttrValDOS);
            mealDOS.add(mealDO);
        }
        return mealDOS;
    }

    /**
     *
     * @return 获得商品的总数量
     */
    @Override
    public int getItemCount() {
        return itemDOMapper.getItemCount();
    }
}
