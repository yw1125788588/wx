package com.imooc.wx.mapper;

import com.imooc.wx.entity.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMapper {
    /**
     * @param id
     * @return
     */
    //主键查询
    SysRole queryById(Integer id);

    /**
     * @param offset
     * @param limit
     * @return
     */
    //查询指定行
   List<SysRole> queryAllByLimit(@Param("offset")int offset,@Param("limit")int limit);

    /**
     * @param sysRole
     * @return
     */
   //通过实体类查询
    List<SysRole> queryAll(SysRole sysRole);
    //新增数据
     int insert(SysRole sysRole);

    /**
     * @param sysRole
     * @return
     */
     //修改数据
    int update(SysRole sysRole);

    /**
     * @param id
     * @return
     */
    //删除数据
    int deleteById(Integer id);

    /**
     * @param userId
     * @return
     */
    //查询用户角色
    List<SysRole> selectlistByUser(Integer userId);

}
