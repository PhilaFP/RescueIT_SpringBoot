package com.RescueIT.controller;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import junit.framework.Assert;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)

public class ReportControllerTest {
	private MockMvc mockMvc;
    @Before
    public void setUp() {
     mockMvc = MockMvcBuilders.standaloneSetup(new ReportController()).build();
    }
    
    
	@Test
	public void testGetAddNewReport() throws Exception{
        this.mockMvc.perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(view().name("addReport"))
        .andDo(print());
	}

	@Test
	public void testProcesAddNewReport() throws Exception{
		//fail("Not yet implemented");
	}

	@Test
	public void testGetAllReports() throws Exception{
		//fail("Not yet implemented");
	}
}
