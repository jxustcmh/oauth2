package com.hx.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 *  认证服务器，用于获取token
 * @author jxlgcmh
 * @date 2019-08-02 09:35
 */
@SpringBootApplication
@MapperScan("com.hx.oauth2.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }

}
