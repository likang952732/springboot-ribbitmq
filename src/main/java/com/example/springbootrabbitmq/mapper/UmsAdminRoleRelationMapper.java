package com.example.springbootrabbitmq.mapper;

import com.example.springbootrabbitmq.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 @Description 后台用户与角色管理自定义Dao
 *@author kang.li
 *@date 2020/7/1 21:13   
 */
public interface UmsAdminRoleRelationMapper {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
