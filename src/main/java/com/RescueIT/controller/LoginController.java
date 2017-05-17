package com.RescueIT.controller;

import javax.validation.Valid;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.RescueIT.domain.Login;
import com.RescueIT.domain.Report;
import com.RescueIT.domain.User;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(Model model){
        Login login = new Login();
        model.addAttribute("newLogin", login);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String procesLogin(@ModelAttribute("newLogin") @Valid Login login, BindingResult bindingResult) {
	
    	if (bindingResult.hasErrors()) {
            return "login";
        }
    	    
    	   	        
        return "redirect:/main";
    }
}
