package com.imooc.wx.service.Imp;

import com.imooc.wx.entity.SysUser;
import com.imooc.wx.mapper.SysUsermapper;
import com.imooc.wx.service.SysUserService;

import javax.annotation.Resource;
import java.util.List;

public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUsermapper sysUsermapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Integer id) {
        return this.sysUsermapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUser> queryAllByLimit(int offset, int limit) {
        return this.sysUsermapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUsermapper.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUsermapper.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysUsermapper.deleteById(id) > 0;
    }

    @Override
    public SysUser selectByName(String userName) {
        return this.sysUsermapper.selectByName(userName);
    }
}
