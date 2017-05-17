package com.RescueIT.domain;

import javax.validation.constraints.Size;

public class Login {
	
	@Size(min=6, max=12, message="{Nazwa użytkownika powinna mieścić się w przedziale od 6 do 12 znaków}")
	private String username;
	
	@Size(min=6, max=12, message="{Hasło powinno zawierać od 6 do 12 znaków}")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Login(){}
	public Login(String user, String pass){
		this.username = user;
		this.password = pass;
	}
	
}
