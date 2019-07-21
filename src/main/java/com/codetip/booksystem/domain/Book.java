package com.codetip.booksystem.domain;


public class Book {

  private Integer id;
  private String author;
  private String bianhao;
  private java.sql.Timestamp createDateTime;
  private double danjia;
  private String imageUrl;
  private String name;
  private Integer num;
  private Integer orderNo;
  private String press;
  private java.sql.Timestamp updateDateTime;
  private Integer bookTypeId;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }


  public String getBianhao() {
    return bianhao;
  }

  public void setBianhao(String bianhao) {
    this.bianhao = bianhao;
  }


  public java.sql.Timestamp getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(java.sql.Timestamp createDateTime) {
    this.createDateTime = createDateTime;
  }


  public double getDanjia() {
    return danjia;
  }

  public void setDanjia(double danjia) {
    this.danjia = danjia;
  }


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }


  public Integer getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(Integer orderNo) {
    this.orderNo = orderNo;
  }


  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }


  public java.sql.Timestamp getUpdateDateTime() {
    return updateDateTime;
  }

  public void setUpdateDateTime(java.sql.Timestamp updateDateTime) {
    this.updateDateTime = updateDateTime;
  }


  public Integer getBookTypeId() {
    return bookTypeId;
  }

  public void setBookTypeId(Integer bookTypeId) {
    this.bookTypeId = bookTypeId;
  }

}
