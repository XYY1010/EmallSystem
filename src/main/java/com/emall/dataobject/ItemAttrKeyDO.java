package com.emall.dataobject;

public class ItemAttrKeyDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_item_attr_key.attr_key_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private Integer attrKeyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_item_attr_key.item_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_item_attr_key.attr_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String attrName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_item_attr_key.attr_key_id
     *
     * @return the value of em_item_attr_key.attr_key_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public Integer getAttrKeyId() {
        return attrKeyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_item_attr_key.attr_key_id
     *
     * @param attrKeyId the value for em_item_attr_key.attr_key_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAttrKeyId(Integer attrKeyId) {
        this.attrKeyId = attrKeyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_item_attr_key.item_id
     *
     * @return the value of em_item_attr_key.item_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_item_attr_key.item_id
     *
     * @param itemId the value for em_item_attr_key.item_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_item_attr_key.attr_name
     *
     * @return the value of em_item_attr_key.attr_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_item_attr_key.attr_name
     *
     * @param attrName the value for em_item_attr_key.attr_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }
}