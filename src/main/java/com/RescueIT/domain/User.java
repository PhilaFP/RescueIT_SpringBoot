package com.RescueIT.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class User {
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    private Integer id;
	
	@Column
	@Size(min=2, max=30, message="{Długosć imienia powinna mieścić się w przedziale od 2 do 30 znaków}")
	private String name;
	
	@Column
	@NotNull
	@Size(min=2, max=30, message="{Długosć nazwiska powinna mieścić się w przedziale od 2 do 30 znaków}")
	private String surname;
	
	@Column
	@Size(min=6, max=12, message="{Nazwa użytkownika powinna mieścić się w przedziale od 6 do 12 znaków}")
	private String username;
	
	@Column
	@Pattern(regexp="\\d{11}", message="{Błędny numer PESEL}")
	private String pesel;
	
	@Column
	@Size(min=6, max=12, message="{Hasło powinno zawierać od 6 do 12 znaków}")
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
