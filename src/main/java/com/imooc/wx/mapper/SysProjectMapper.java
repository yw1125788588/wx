package com.imooc.wx.mapper;

import com.imooc.wx.entity.SysProject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysProjectMapper {
    /**
     * @param id
     * @return
     */
    //主键查询
    SysProject queryById(Integer id);

    /**
     * @param offset
     * @param limit
     * @return
     */
    //行查询
    List<SysProject> queryAllByLimit(@Param("offset")int offset,@Param("limit")int limit);

    /**
     * @param sysProject
     * @return
     */
    //实体类查询
    List<SysProject> queryAll(SysProject sysProject);

    /**
     * @param sysProject
     * @return
     */
    //新增数据
    int insert(SysProject sysProject);

    /**
     * @param sysProject
     * @return
     */
    //修改数据
    int update(SysProject sysProject);

    /**
     * @param id
     * @return
     */
    //通过主键删除数据
    SysProject deleteById(Integer id);
}
