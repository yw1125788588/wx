package com.imooc.wx.service.Imp;

import com.imooc.wx.entity.SysDrug;
import com.imooc.wx.mapper.SysDrugMapper;
import com.imooc.wx.service.SysDrugService;

import javax.annotation.Resource;
import java.util.List;

public class SysDrugServiceImp implements SysDrugService {
    @Resource
    private SysDrugMapper sysDrugMapper;

    @Override
    public SysDrug queryById(Integer id) {
        return this.sysDrugMapper.queryById(id);
    }

    @Override
    public List<SysDrug> queryAllByLimit(int offset, int limit) {
        return this.sysDrugMapper.queryAllByIdLimit(offset,limit);
    }

    @Override
    public SysDrug insert(SysDrug sysDrug) {
        this.sysDrugMapper.insert(sysDrug);
        return sysDrug;
    }

    @Override
    public SysDrug update(SysDrug sysDrug) {
        this.sysDrugMapper.update(sysDrug);
        return sysDrug;
    }

    @Override
    public boolean deleteById(Integer id) {
        return this.sysDrugMapper.deleteById(id)>0;
    }
}
