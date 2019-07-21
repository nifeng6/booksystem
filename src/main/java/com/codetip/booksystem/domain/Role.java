package com.codetip.booksystem.domain;


public class Role {

  private Integer id;
  private java.sql.Timestamp createDateTime;
  private String name;
  private Integer orderNo;
  private java.sql.Timestamp updateDateTime;


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


  public java.sql.Timestamp getUpdateDateTime() {
    return updateDateTime;
  }

  public void setUpdateDateTime(java.sql.Timestamp updateDateTime) {
    this.updateDateTime = updateDateTime;
  }

}
