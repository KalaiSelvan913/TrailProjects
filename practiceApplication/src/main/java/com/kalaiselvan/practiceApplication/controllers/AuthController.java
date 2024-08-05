package com.kalaiselvan.practiceApplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalaiselvan.practiceApplication.models.User;
import com.kalaiselvan.practiceApplication.payload.request.LoginRequest;
import com.kalaiselvan.practiceApplication.payload.request.SignupRequest;
import com.kalaiselvan.practiceApplication.security.jwt.JwtService;
import com.kalaiselvan.practiceApplication.security.services.UserDetailsServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	private UserDetailsServiceImpl userDetailService;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	JwtService jwtService;
	
	@PostMapping("/addUser")
	public String adduser(@RequestBody SignupRequest signup) {
		User user = new User();
		user.setUsername(signup.getUsername());
		user.setPassword(signup.getPassword());
		user.setEmail(signup.getEmail());
//		user.setRoles(signup.getRoles());
		return userDetailService.addUser(user);
	}
	
	
	@PostMapping("/login")
	public String loginUser(@RequestBody LoginRequest request) {
		Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(request.getUserName());  
		}else {
			throw new UsernameNotFoundException("invalid user request !");
		}
	}
	
	

}
