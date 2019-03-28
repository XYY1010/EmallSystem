package com.emall.controller;

import com.emall.error.BusinessException;
import com.emall.response.CommonReturnType;
import com.emall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create by chaikai on 2019/01/15
 */
@CrossOrigin
@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/getItems")
    public CommonReturnType getItemList() throws BusinessException{
        CommonReturnType returnType =  new CommonReturnType();
        returnType = itemService.getItemList();
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
    @GetMapping("/getHotItems")
    public CommonReturnType getHotItems(@RequestParam("number") int number) throws  BusinessException{
        return itemService.getTopSales(number);
    }
    @GetMapping("/getIntroImg")
    public CommonReturnType getIntroImg(@RequestParam("itemId") String itemId) throws BusinessException{
        return itemService.getIntroImg(itemId);
    }
    @GetMapping("/getComments")
    public CommonReturnType getComments(@RequestParam("itemId") String itemId) throws BusinessException{
        return itemService.getComments(itemId);
    }
}