package com.RescueIT.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Temporal(TemporalType.TIME)
	private Date reportTime;
	
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
    
    public Integer getId(){
    	return id;
    }
    
    public void setId(Integer id){
    	this.id = id;
    }
    
    public Date getReportTime() {
		return reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}
	public Integer getIdLifeguard() {
		return idLifeguard;
	}
	public void setIdLifeguard(Integer idLifeguard) {
		this.idLifeguard = idLifeguard;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

    public Report(){
    	Calendar cal = Calendar.getInstance();
        this.reportTime = cal.getTime();
        setIdUser(123);
    }
    public Report(String message){
    	Calendar cal = Calendar.getInstance();
        this.reportTime = cal.getTime();
        
        this.message = message;
    }

}
