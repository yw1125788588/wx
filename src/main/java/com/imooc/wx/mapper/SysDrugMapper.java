package com.imooc.wx.mapper;

import com.imooc.wx.entity.SysDrug;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysDrugMapper {
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysDrug queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysDrug> queryAllByIdLimit(@Param("offset") int offset,@Param("limit") int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysDrug 实例对象
     * @return 对象列表
     */
    List<SysDrug> queryAll(SysDrug sysDrug);
    /**
     * 新增数据
     *
     * @param sysDrug 实例对象
     * @return 影响行数
     */
    int insert(SysDrug sysDrug);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);
    /**
     * 根据药品名查询药品
     *
     * @param drugName
     * @return
     */
    SysDrug selectByName(String drugName);
    /**
     * 修改数据
     *
     * @param sysDrug 实例对象
     * @return 影响行数
     */
    int update(SysDrug sysDrug);
}

