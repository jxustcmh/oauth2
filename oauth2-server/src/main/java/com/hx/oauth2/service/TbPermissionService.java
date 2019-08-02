package com.hx.oauth2.service;


import com.hx.oauth2.entity.TbPermission;

import java.util.List;

public interface TbPermissionService {
    default List<TbPermission> selectByUserId(Long userId) {
        return null;
    }
}
