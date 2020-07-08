package com.example.springbootrabbitmq.mapper;

import com.example.springbootrabbitmq.model.UmsAdmin;
import com.example.springbootrabbitmq.model.UmsAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 @Description
 *@author kang.li
 *@date 2020/7/1 21:11   
 */
public interface UmsAdminMapper {
    int countByExample(UmsAdminExample example);

    int deleteByExample(UmsAdminExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdmin record);

    int insertSelective(UmsAdmin record);

    List<UmsAdmin> selectByExample(UmsAdminExample example);

    UmsAdmin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByExample(@Param("record") UmsAdmin record, @Param("example") UmsAdminExample example);

    int updateByPrimaryKeySelective(UmsAdmin record);

    int updateByPrimaryKey(UmsAdmin record);
}
