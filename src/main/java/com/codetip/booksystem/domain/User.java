package com.codetip.booksystem.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;
public class User {

  private Integer id;
  @DateTimeFormat(pattern = "yyyy-MM-dd")//通过valid注解获取当前时间，我真是个小天才
  private Date createDateTime;
  @NotNull(message="用户名不能为空！")
  private String name;
  @NotNull(message="排序号不能为空！")
  private Integer orderNo;
  private String pwd;
  private String remark;
  @NotNull(message="真实姓名不能为空！")
  private String trueName;
  private String updateDateTime;
  private Integer roleId;

  public Date getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(Date createDateTime) {
    this.createDateTime = createDateTime;
  }

  public void setUpdateDateTime(String updateDateTime) {
    this.updateDateTime = updateDateTime;
  }

  public String getUpdateDateTime() {
    return updateDateTime;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public Integer getRoleId() {
    return roleId;
  }

  public void setRoleId(Integer roleId) {
    this.roleId = roleId;
  }

}
