package com.RescueIT.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.RescueIT.domain.User;

@RunWith(SpringRunner.class)

public class UserControllerTest {
	private MockMvc mockMvc;
    @Before
    public void setUp() {
     mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }
    
    
	@Test
	public void testgetAddNewUser() throws Exception{
        this.mockMvc.perform(get("/register"))
        .andExpect(status().isOk())
        .andExpect(view().name("addUser"))
        .andDo(print());
	}
	@Test
	public void testprocesAddNewUser() throws Exception{
		//fail("Not yet implemented");
	}


}
