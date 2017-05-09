package com.RescueIT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RescueIT.domain.Report;
import com.RescueIT.repository.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService{
	
	@Autowired
	private ReportRepository reportRepository;
	
	public List<Report> getListOfReports(){
		return (List<Report>)reportRepository.findAll();
	}
	
}
