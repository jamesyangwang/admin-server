package com.example.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSecurityConfig {
//	extends WebSecurityConfigurerAdapter {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//          .formLogin()
//          .loginPage("/login.html")
//          .loginProcessingUrl("/login")
//          .permitAll();
//        http
//          .logout().logoutUrl("/logout");
//        http
//          .csrf().disable();
//        http
//          .authorizeRequests()
//          .antMatchers("/login.html", "/**/*.css", "/img/**", "/third-party/**")
//          .permitAll();
//        http
//          .authorizeRequests()
//          .antMatchers("/**")
//          .authenticated();
//        http.httpBasic();
//    }
}