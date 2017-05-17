package com.RescueIT.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Filip on 08.05.2017.
 */
@Entity
public class Report {
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Id
	private Integer id;
	
	@Column
    private String message;

	@Column
	private Integer idLifeguard;
	
	@Column
	private Integer idUser;
	
    public String getMessage() {
        return message;

    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Report(){}
    public Report(String message){
        this.message = message;
    }

}
