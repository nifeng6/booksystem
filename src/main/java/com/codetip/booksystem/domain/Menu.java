package com.codetip.booksystem.domain;


public class Menu {

  private Integer id;
  private String divId;
  private String icon;
  private String name;
  private Integer orderNo;
  private Integer pId;
  private String permissions;
  private Integer state;
  private Integer type;
  private String url;


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getDivId() {
    return divId;
  }

  public void setDivId(String divId) {
    this.divId = divId;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
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


  public Integer getPId() {
    return pId;
  }

  public void setPId(Integer pId) {
    this.pId = pId;
  }


  public String getPermissions() {
    return permissions;
  }

  public void setPermissions(String permissions) {
    this.permissions = permissions;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
