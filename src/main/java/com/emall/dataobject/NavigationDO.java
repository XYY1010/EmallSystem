package com.emall.dataobject;

public class NavigationDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_navigation.id
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_navigation.source_url
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    private String sourceUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_navigation.buy_url
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    private String buyUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_navigation.name
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_navigation.buy_status
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    private Byte buyStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_navigation.classify
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    private String classify;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_navigation.id
     *
     * @return the value of em_navigation.id
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_navigation.id
     *
     * @param id the value for em_navigation.id
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_navigation.source_url
     *
     * @return the value of em_navigation.source_url
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_navigation.source_url
     *
     * @param sourceUrl the value for em_navigation.source_url
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_navigation.buy_url
     *
     * @return the value of em_navigation.buy_url
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public String getBuyUrl() {
        return buyUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_navigation.buy_url
     *
     * @param buyUrl the value for em_navigation.buy_url
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl == null ? null : buyUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_navigation.name
     *
     * @return the value of em_navigation.name
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_navigation.name
     *
     * @param name the value for em_navigation.name
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_navigation.buy_status
     *
     * @return the value of em_navigation.buy_status
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public Byte getBuyStatus() {
        return buyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_navigation.buy_status
     *
     * @param buyStatus the value for em_navigation.buy_status
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public void setBuyStatus(Byte buyStatus) {
        this.buyStatus = buyStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_navigation.classify
     *
     * @return the value of em_navigation.classify
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public String getClassify() {
        return classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_navigation.classify
     *
     * @param classify the value for em_navigation.classify
     *
     * @mbg.generated Mon Mar 18 20:41:09 CST 2019
     */
    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }
}