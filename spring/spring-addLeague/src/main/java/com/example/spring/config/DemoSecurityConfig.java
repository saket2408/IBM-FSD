package com.example.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
			.withUser(users.username("saket").password("pass@123").roles("PLAYER"))
			.withUser(users.username("admin").password("admin").roles("PLAYER","ADMIN"));
			
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/").hasRole("PLAYER")
		.antMatchers("/list").hasRole("PLAYER")
		.antMatchers("/searchLeague").hasRole("PLAYER")
		.antMatchers("/league/**").hasRole("ADMIN")
		.and()
		.formLogin()
		.permitAll()
		.and()
		.logout().permitAll();
	}
	
	

	
}
