package com.emall.dataobject;

import java.math.BigDecimal;

public class ShoppingCartDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.cart_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private String cartId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.item_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private String itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.item_title
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private String itemTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.user_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.stock_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private Integer stockId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.attr_img
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private String attrImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.price
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.amount
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_shopping_cart.attr_vals
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    private String attrVals;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.cart_id
     *
     * @return the value of em_shopping_cart.cart_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public String getCartId() {
        return cartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.cart_id
     *
     * @param cartId the value for em_shopping_cart.cart_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setCartId(String cartId) {
        this.cartId = cartId == null ? null : cartId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.item_id
     *
     * @return the value of em_shopping_cart.item_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.item_id
     *
     * @param itemId the value for em_shopping_cart.item_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.item_title
     *
     * @return the value of em_shopping_cart.item_title
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public String getItemTitle() {
        return itemTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.item_title
     *
     * @param itemTitle the value for em_shopping_cart.item_title
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle == null ? null : itemTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.user_id
     *
     * @return the value of em_shopping_cart.user_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.user_id
     *
     * @param userId the value for em_shopping_cart.user_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.stock_id
     *
     * @return the value of em_shopping_cart.stock_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.stock_id
     *
     * @param stockId the value for em_shopping_cart.stock_id
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.attr_img
     *
     * @return the value of em_shopping_cart.attr_img
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public String getAttrImg() {
        return attrImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.attr_img
     *
     * @param attrImg the value for em_shopping_cart.attr_img
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setAttrImg(String attrImg) {
        this.attrImg = attrImg == null ? null : attrImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.price
     *
     * @return the value of em_shopping_cart.price
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.price
     *
     * @param price the value for em_shopping_cart.price
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.amount
     *
     * @return the value of em_shopping_cart.amount
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.amount
     *
     * @param amount the value for em_shopping_cart.amount
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_shopping_cart.attr_vals
     *
     * @return the value of em_shopping_cart.attr_vals
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public String getAttrVals() {
        return attrVals;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_shopping_cart.attr_vals
     *
     * @param attrVals the value for em_shopping_cart.attr_vals
     *
     * @mbg.generated Thu Dec 27 15:26:02 CST 2018
     */
    public void setAttrVals(String attrVals) {
        this.attrVals = attrVals == null ? null : attrVals.trim();
    }
}