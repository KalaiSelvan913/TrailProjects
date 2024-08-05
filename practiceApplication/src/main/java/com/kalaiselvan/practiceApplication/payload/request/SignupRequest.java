package com.kalaiselvan.practiceApplication.payload.request;

import java.util.Set;

import com.kalaiselvan.practiceApplication.models.Role;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SignupRequest {
	
	private String username;
	
	private String email;
	
	private String password;
	
	private Set<Role> roles;

}
