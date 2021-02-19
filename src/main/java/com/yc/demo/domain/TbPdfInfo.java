package com.yc.demo.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_pdf_info
 *
 * @mbg.generated do_not_delete_during_merge Fri Feb 19 11:34:20 CST 2021
 */
public class TbPdfInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.id
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   订单号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.order_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   成品号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.product_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String productNo;

    /**
     * Database Column Remarks:
     *   序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.serial_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String serialNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.create_time
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.update_time
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.create_user
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.update_user
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.remark
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   对应模板的名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.model_name
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String modelName;

    /**
     * Database Column Remarks:
     *   PDF所有数据顺序存储
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_pdf_info.info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    private String info;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.id
     *
     * @return the value of tb_pdf_info.id
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.id
     *
     * @param id the value for tb_pdf_info.id
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.order_no
     *
     * @return the value of tb_pdf_info.order_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.order_no
     *
     * @param orderNo the value for tb_pdf_info.order_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.product_no
     *
     * @return the value of tb_pdf_info.product_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.product_no
     *
     * @param productNo the value for tb_pdf_info.product_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.serial_no
     *
     * @return the value of tb_pdf_info.serial_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.serial_no
     *
     * @param serialNo the value for tb_pdf_info.serial_no
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.create_time
     *
     * @return the value of tb_pdf_info.create_time
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.create_time
     *
     * @param createTime the value for tb_pdf_info.create_time
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.update_time
     *
     * @return the value of tb_pdf_info.update_time
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.update_time
     *
     * @param updateTime the value for tb_pdf_info.update_time
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.create_user
     *
     * @return the value of tb_pdf_info.create_user
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.create_user
     *
     * @param createUser the value for tb_pdf_info.create_user
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.update_user
     *
     * @return the value of tb_pdf_info.update_user
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.update_user
     *
     * @param updateUser the value for tb_pdf_info.update_user
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.remark
     *
     * @return the value of tb_pdf_info.remark
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.remark
     *
     * @param remark the value for tb_pdf_info.remark
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.model_name
     *
     * @return the value of tb_pdf_info.model_name
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.model_name
     *
     * @param modelName the value for tb_pdf_info.model_name
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_pdf_info.info
     *
     * @return the value of tb_pdf_info.info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_pdf_info.info
     *
     * @param info the value for tb_pdf_info.info
     *
     * @mbg.generated Fri Feb 19 11:34:20 CST 2021
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}