package com.emall.dataobject;

import java.util.Date;

public class UserDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.user_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.user_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.telephone
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.address
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.email
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.gender
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private Boolean gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.avatar_url
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String avatarUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.birthday
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column em_user_info.hometown
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    private String hometown;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.user_id
     *
     * @return the value of em_user_info.user_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.user_id
     *
     * @param userId the value for em_user_info.user_id
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.user_name
     *
     * @return the value of em_user_info.user_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.user_name
     *
     * @param userName the value for em_user_info.user_name
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.telephone
     *
     * @return the value of em_user_info.telephone
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.telephone
     *
     * @param telephone the value for em_user_info.telephone
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.address
     *
     * @return the value of em_user_info.address
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.address
     *
     * @param address the value for em_user_info.address
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.email
     *
     * @return the value of em_user_info.email
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.email
     *
     * @param email the value for em_user_info.email
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.gender
     *
     * @return the value of em_user_info.gender
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.gender
     *
     * @param gender the value for em_user_info.gender
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.avatar_url
     *
     * @return the value of em_user_info.avatar_url
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.avatar_url
     *
     * @param avatarUrl the value for em_user_info.avatar_url
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.birthday
     *
     * @return the value of em_user_info.birthday
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.birthday
     *
     * @param birthday the value for em_user_info.birthday
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column em_user_info.hometown
     *
     * @return the value of em_user_info.hometown
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public String getHometown() {
        return hometown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column em_user_info.hometown
     *
     * @param hometown the value for em_user_info.hometown
     *
     * @mbg.generated Wed Dec 26 15:53:52 CST 2018
     */
    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }
}