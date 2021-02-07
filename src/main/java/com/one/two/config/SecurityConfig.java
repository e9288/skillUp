package com.one.two.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class SecurityConfig  extends WebSecurityConfigurerAdapter {
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	                .antMatchers("/", "/moduleOne/hello").permitAll()
	                .anyRequest().authenticated()
	                .and()
	                .formLogin()
	                .and()
	                .httpBasic();
	    }
}
