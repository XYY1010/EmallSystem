package com.emall.controller;

import com.emall.error.BusinessException;
import com.emall.response.CommonReturnType;
import com.emall.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create by chaikai on 2019/01/15
 */
@CrossOrigin
@RestController
@Slf4j
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/getItems")
    public CommonReturnType getItemList(@RequestParam("currPage")int currPage,
                                     @RequestParam("pageSize")int pageSize) throws BusinessException{
        CommonReturnType returnType =  new CommonReturnType();
        if(currPage <= 0 || pageSize <= 0) {
            returnType.setStatus("false");
            return returnType;
        }
        returnType = itemService.getItemList(currPage,pageSize);
        return returnType;
    }

    @GetMapping("/getItemDetail")
    public CommonReturnType getItemDetail(@RequestParam("itemId") String itemId) throws BusinessException{
        return itemService.getItemDetil(itemId);
    }

    @GetMapping("/getItemPrizeAndStock")
    public CommonReturnType getItemPrizeAndStock(@RequestParam("itemId") String itemId,
                                                 @RequestParam("symbol") String symbol) throws BusinessException{
        return itemService.getItemPriceAndStock(itemId,symbol);
    }
    @GetMapping("/getItemCount")
    public CommonReturnType getItemCount() throws BusinessException{
        return CommonReturnType.create(itemService.getItemCount());
    }
    @GetMapping("/getHotItems")
    public CommonReturnType getHotItems(@RequestParam("number") int number) throws  BusinessException{
        return itemService.getTopSales(number);
    }
    @GetMapping("/getIntroImg")
    public CommonReturnType getIntroImg(@RequestParam("itemId") String itemId) throws BusinessException{
        return itemService.getIntroImg(itemId);
    }
}