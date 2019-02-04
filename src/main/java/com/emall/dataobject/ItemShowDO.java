package com.emall.dataobject;

import java.util.List;

public class ItemShowDO {
    private String itemId;
    private String itemTitle;
    private Integer itemSales;
    private String itemDetailImage;
    private String itemIntroImage;
    private List<MealDO> meal;
    private List<ItemDO> topSales;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Integer getItemSales() {
        return itemSales;
    }

    public void setItemSales(Integer itemSales) {
        this.itemSales = itemSales;
    }

    public String getItemDetailImage() {
        return itemDetailImage;
    }

    public void setItemDetailImage(String itemDetailImage) {
        this.itemDetailImage = itemDetailImage;
    }

    public String getItemIntroImage() {
        return itemIntroImage;
    }

    public void setItemIntroImage(String itemIntroImage) {
        this.itemIntroImage = itemIntroImage;
    }

    public List<MealDO> getMeal() {
        return meal;
    }

    public void setMeal(List<MealDO> meal) {
        this.meal = meal;
    }

    public List<ItemDO> getTopSales() {
        return topSales;
    }

    public void setTopSales(List<ItemDO> topSales) {
        this.topSales = topSales;
    }
}
