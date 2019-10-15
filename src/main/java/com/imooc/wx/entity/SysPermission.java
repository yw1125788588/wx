package com.imooc.wx.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysPermission implements Serializable {
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = -71969734644822184L;
    private Integer id;
    private String permission_code;
    private String permission_name;

    public String getPermission_name() {
        return permission_name;
    }

    public void setPermission_name(String permission_name) {
        this.permission_name = permission_name;
    }

    public String getPermission_code() {
        return permission_code;
    }

    public void setPermission_code(String permission_code) {
        this.permission_code = permission_code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionCode() {
        return null;
    }
}
