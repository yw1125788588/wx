package com.imooc.wx.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRequestPathPermissionRelation implements Serializable {
    private static final long serialVersionUID = -59197738311147860L;

    private Integer id;
    private Integer urlId;
    private Integer permissionId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }


}
