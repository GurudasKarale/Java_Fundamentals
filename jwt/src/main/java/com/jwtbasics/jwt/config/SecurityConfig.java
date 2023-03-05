package com.jwtbasics.jwt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.jwtbasics.jwt.services.CustomUserDetailsService;


@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
	
	 //AuthenticationManager authenticationManager;
	@Autowired
	private JwtAuthenticationFilter jwtFilter;
	
	  @Autowired
	  private CustomUserDetailsService customUserDetailsService;   
	  
	
	  @Bean
      public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		  
		  //AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
	      //authenticationManagerBuilder.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
	      //authenticationManager = authenticationManagerBuilder.build();
		  
          http.cors().and().csrf().disable()
                  
                  .authorizeHttpRequests()
                  .requestMatchers("/token").permitAll()
                  .anyRequest().authenticated().and()
                  //.authenticationManager(authenticationManager)
          .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  
          http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
          
          return http.build();
      }
	  
	  
	  
	  @Bean
	  public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
		  
	       return authenticationConfiguration.getAuthenticationManager();
	    }

	  @Bean
	  public PasswordEncoder passwordEncoder() {
	       return new BCryptPasswordEncoder();
	    }
	


}
