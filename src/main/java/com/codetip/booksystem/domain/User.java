package com.codetip.booksystem.domain;


public class User {

  private Integer id;
  private java.sql.Timestamp createDateTime;
  private String name;
  private Integer orderNo;
  private String pwd;
  private String remark;
  private String trueName;
  private java.sql.Timestamp updateDateTime;
  private Integer roleId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public java.sql.Timestamp getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(java.sql.Timestamp createDateTime) {
    this.createDateTime = createDateTime;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getTrueName() {
    return trueName;
  }

  public void setTrueName(String trueName) {
    this.trueName = trueName;
  }


  public java.sql.Timestamp getUpdateDateTime() {
    return updateDateTime;
  }

  public void setUpdateDateTime(java.sql.Timestamp updateDateTime) {
    this.updateDateTime = updateDateTime;
  }


  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

}
