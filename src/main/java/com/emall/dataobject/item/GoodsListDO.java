package com.emall.dataobject.item;

public class GoodsListDO {
    private String itemId;
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private String img;
    private String intro;
    private int remarks;
    private int itemSales;
    public GoodsListDO(){
        remarks = 100;
    }
    public GoodsListDO(String itemId,String img,String intro,int remarks){
        this.itemId = itemId;
        this.img = img;
        this.intro = intro;
        this.remarks = remarks;
    }

    public int getItemSales() {
        return itemSales;
    }

    public void setItemSales(int itemSales) {
        this.itemSales = itemSales;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public int getRemarks() {
        return remarks;
    }

    public void setRemarks(int remarks) {
        this.remarks = remarks;
    }
}
