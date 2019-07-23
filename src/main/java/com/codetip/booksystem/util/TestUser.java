package com.codetip.booksystem.util;

import javax.validation.constraints.NotNull;

public class TestUser {
    private int id;
    @NotNull(message = "姓名不能为空")
    private String name;
    private String truename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }
}
