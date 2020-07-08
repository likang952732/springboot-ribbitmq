package com.example.springbootrabbitmq.mapper;

import com.example.springbootrabbitmq.model.UmsPermission;
import com.example.springbootrabbitmq.model.UmsPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 @Description
 *@author kang.li
 *@date 2020/7/2 10:11   
 */
public interface UmsPermissionMapper {
    int countByExample(UmsPermissionExample example);

    int deleteByExample(UmsPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsPermission record);

    int insertSelective(UmsPermission record);

    List<UmsPermission> selectByExample(UmsPermissionExample example);

    UmsPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int updateByExample(@Param("record") UmsPermission record, @Param("example") UmsPermissionExample example);

    int updateByPrimaryKeySelective(UmsPermission record);

    int updateByPrimaryKey(UmsPermission record);
}
