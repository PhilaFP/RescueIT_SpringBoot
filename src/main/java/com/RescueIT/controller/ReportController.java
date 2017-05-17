package com.RescueIT.controller;

import com.RescueIT.domain.Report;
import com.RescueIT.repository.ReportRepository;
import com.RescueIT.service.ReportService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


/**
 * Created by Filip on 08.05.2017.
 */

@Controller
public class ReportController {
	
    @Autowired
    private ReportRepository reportRepository;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String getAddNewReport(Model model){
        Report newReport = new Report();
        model.addAttribute("newReport", newReport);
        return "addReport";
    }

    @RequestMapping(value = "/main", method = RequestMethod.POST)
    public String procesAddNewReport(@ModelAttribute("newReport")  Report newReport) { 	
    	  	
    	try {
    		reportRepository.save(newReport);
    	} catch (DataAccessException ex) {
            System.out.println(ex.getCause().getMessage());
        }       
    	   	        
        return "redirect:/main";
    }
    
    @Autowired
    private ReportService reportService;
    
    @RequestMapping(value = "/show")
    public String getAllReports(Model model) {
    	List <Report> reportList = reportService.getListOfReports();
    	model.addAttribute("reports", reportList);

    	return "showReports";
    }
    

}
