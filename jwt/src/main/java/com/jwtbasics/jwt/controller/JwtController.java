package com.jwtbasics.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jwtbasics.jwt.helper.JwtUtil;
import com.jwtbasics.jwt.model.JwtRequest;
import com.jwtbasics.jwt.model.JwtResponse;
import com.jwtbasics.jwt.services.CustomUserDetailsService;

@RestController
public class JwtController {


	  @Autowired
	  private AuthenticationManager authenticationManager;
	
	  @Autowired
	  private CustomUserDetailsService customUserDetailsService;  
	  
	  @Autowired
	  private JwtUtil jwtutil;

	@RequestMapping(value = "/token", method = RequestMethod.POST)
	public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{
		
		System.out.println(jwtRequest);
		//passwordEncoder.encode(jwtRequest.getPassword());
		
		try {
			
			this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
			
		}catch(UsernameNotFoundException e){
			
			e.printStackTrace();
			throw new Exception("Bad credentials");
			
		}
		
		UserDetails userdetails = this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
		String tok = this.jwtutil.generateToken(userdetails);
		
		return ResponseEntity.ok(new JwtResponse(tok));
	}
	
}
