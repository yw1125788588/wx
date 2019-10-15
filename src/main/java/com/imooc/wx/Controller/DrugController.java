package com.imooc.wx.Controller;

import com.imooc.wx.service.SysDrugService;
import com.imooc.wx.web.JsonResult;
import com.imooc.wx.web.ResultTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrugController {
    @Autowired
    SysDrugService sysDrugService;
    @GetMapping("getDrug")
    public JsonResult getDrug(){
        sysDrugService.queryAllByLimit(2,200);
        return ResultTool.success();
    }
}
