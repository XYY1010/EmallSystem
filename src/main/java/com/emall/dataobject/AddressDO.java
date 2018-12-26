package com.emall.dataobject;

public class AddressDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.address_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.user_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.receiver_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String receiverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.receiver_phone
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String receiverPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.address
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.address_detail
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String addressDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.postal_code
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String postalCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_address.is_default
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private Boolean isDefault;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.address_id
     *
     * @return the value of em_address.address_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.address_id
     *
     * @param addressId the value for em_address.address_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAddressId(String addressId) {
        this.addressId = addressId == null ? null : addressId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.user_id
     *
     * @return the value of em_address.user_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.user_id
     *
     * @param userId the value for em_address.user_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.receiver_name
     *
     * @return the value of em_address.receiver_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.receiver_name
     *
     * @param receiverName the value for em_address.receiver_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.receiver_phone
     *
     * @return the value of em_address.receiver_phone
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getReceiverPhone() {
        return receiverPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.receiver_phone
     *
     * @param receiverPhone the value for em_address.receiver_phone
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.address
     *
     * @return the value of em_address.address
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.address
     *
     * @param address the value for em_address.address
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.address_detail
     *
     * @return the value of em_address.address_detail
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.address_detail
     *
     * @param addressDetail the value for em_address.address_detail
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.postal_code
     *
     * @return the value of em_address.postal_code
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.postal_code
     *
     * @param postalCode the value for em_address.postal_code
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_address.is_default
     *
     * @return the value of em_address.is_default
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_address.is_default
     *
     * @param isDefault the value for em_address.is_default
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}