package com.hx.oauth2.mapper;

import com.hx.oauth2.entity.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mapper.MyMapper ;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}