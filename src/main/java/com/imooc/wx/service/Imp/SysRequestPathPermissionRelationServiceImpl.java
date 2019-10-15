package com.imooc.wx.service.Imp;

import com.imooc.wx.entity.SysRequestPathPermissionRelation;
import com.imooc.wx.mapper.SysRequestPathPermissionRelationMapper;
import com.imooc.wx.service.SysRequestPathPermissionRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("SysRequestPathPermissionRelationService")
public class SysRequestPathPermissionRelationServiceImpl implements SysRequestPathPermissionRelationService {
    @Resource
    private SysRequestPathPermissionRelationMapper sysRequestPathPermissionRelationMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRequestPathPermissionRelation queryById(Integer id) {
        return this.sysRequestPathPermissionRelationMapper.queryById();
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysRequestPathPermissionRelation> queryAllByLimit(int offset, int limit) {
        return this.sysRequestPathPermissionRelationMapper.queryAllByLimit(offset,limit);
    }
    /**
     * 新增数据
     *
     * @param sysRequestPathPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SysRequestPathPermissionRelation insert(SysRequestPathPermissionRelation sysRequestPathPermissionRelation) {
        this.sysRequestPathPermissionRelationMapper.insert(sysRequestPathPermissionRelation);
        return sysRequestPathPermissionRelation;
    }
    /**
     * 修改数据
     *
     * @param sysRequestPathPermissionRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SysRequestPathPermissionRelation update(SysRequestPathPermissionRelation sysRequestPathPermissionRelation) {
        this.sysRequestPathPermissionRelationMapper.update(sysRequestPathPermissionRelation);
        return sysRequestPathPermissionRelation;
    }
    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysRequestPathPermissionRelationMapper.deleteById()>0;
    }
}
