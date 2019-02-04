package com.emall.service;

import com.emall.error.BusinessException;
import com.emall.response.CommonReturnType;

public interface ItemService {
    CommonReturnType getItemList(int currPage,int pageSize) throws BusinessException;
    CommonReturnType getItemDetil(String itemId) throws BusinessException;
    CommonReturnType getItemPriceAndStock(String itemId,String symbol) throws BusinessException;
    int getItemCount();
}
