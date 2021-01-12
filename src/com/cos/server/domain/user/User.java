package com.cos.server.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private String role;
	
	public String getUsername() {
		return username.replace("<", "&lt;").replace(">","&gt;");
	}
	public String getPassword() {
		return password.replace("<", "&lt;").replace(">","&gt;");
	}
	public String getEmail() {
		return email.replace("<", "&lt;").replace(">","&gt;");
	}
}
