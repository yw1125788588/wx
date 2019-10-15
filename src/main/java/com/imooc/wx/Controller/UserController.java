package com.imooc.wx.Controller;

import com.imooc.wx.entity.SysUser;
import com.imooc.wx.service.SysUserService;
import com.imooc.wx.web.JsonResult;
import com.imooc.wx.web.ResultTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    SysUserService sysUserService;

    @GetMapping("/getUser")
    public JsonResult getUser() {
        List<SysUser> users = sysUserService.queryAllByLimit(1, 100);
        return ResultTool.success(users);
    }
    @GetMapping("/test")
    public JsonResult test() {
        return ResultTool.success("hello world");
    }
}