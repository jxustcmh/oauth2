package com.hx.oauth2.service;


import com.hx.oauth2.entity.TbUser;

public interface TbUserService {
    default TbUser getByUsername(String username) {
        return null;
    }
}
