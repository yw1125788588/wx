package com.imooc.wx.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRequestPath implements Serializable {
    private static final long serialVersionUID = -38398465698914714L;

    private Integer id;
    private String url;
    private String description;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
