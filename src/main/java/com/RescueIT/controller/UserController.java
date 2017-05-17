package com.RescueIT.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.RescueIT.domain.User;
import com.RescueIT.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getAddNewUser(Model model){
        User newUser = new User();
        model.addAttribute("newUser", newUser);
        return "addUser";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String procesAddNewUser(@ModelAttribute("newUser") @Valid User newUser, BindingResult bindingResult) {
	
    	if (bindingResult.hasErrors()) {
            return "addUser";
        }
    	
    	try {
    		userRepository.save(newUser);
    	} catch (DataAccessException ex) {
            System.out.println(ex.getCause().getMessage());
        }       
    	   	        
        return "redirect:/";
    }
}
