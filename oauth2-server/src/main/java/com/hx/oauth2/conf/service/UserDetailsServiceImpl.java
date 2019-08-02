package com.hx.oauth2.conf.service;

import com.hx.oauth2.entity.TbPermission;
import com.hx.oauth2.entity.TbUser;
import com.hx.oauth2.service.TbPermissionService;
import com.hx.oauth2.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDetailsService这个接口是spring-security自己提供的
 * @author jxlgcmh
 * @date 2019-08-02 15:51
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private TbUserService userService;
    @Autowired
    private TbPermissionService permissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> grantedAuthorities =new ArrayList<>();
        TbUser user = userService.getByUsername(username);
        if (user != null) {
            List<TbPermission> permissions = permissionService.selectByUserId(user.getId());
            permissions.forEach(permission ->{
                if (permission != null && permission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
            return  new User(username,user.getPassword(),grantedAuthorities);
        }
        return null;
    }
}
