package com.RescueIT.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private String username;
	
	@Column
	private String pesel;
	
	@Column
	private String password;

	    public User(){}

	    public User(String name, String surname, String username, String pesel, String password){
	        this.name = name;
	        this.surname = surname;
	        this.username = username;
	        this.pesel = pesel;
	        this.password = password;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getSurname() {
	        return surname;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public String getPesel() {
	        return pesel;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setSurname(String surname) {
	        this.surname = surname;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public void setPesel(String pesel) {
	        this.pesel = pesel;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	
}
