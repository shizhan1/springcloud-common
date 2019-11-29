package com.ccsens.eureka.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @description: 权限控制
 * @author: wuHuiJuan
 * @create: 2019/11/26 09:50
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().ignoringAntMatchers("/eureka/**");
        http.authorizeRequests()
                .antMatchers( "/actuator/**").permitAll();
        super.configure(http);


    }

}
