package com.RescueIT.domain;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

import junit.framework.Assert;

public class ReportTest {

	@Test
	public void testGetSetMessage() {
		final Report report = new Report();
		report.setMessage("message");
		Assert.assertEquals(report.getMessage(),"message");	
	}

	@Test
	public void testReport() {
		//fail("Not yet implemented");
	}

	@Test
	public void testReportString() {
		//fail("Not yet implemented");
	}
	
    @Test
    public void testPublicConstructor() {
        final Constructor<?>[] constructors = Report.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Assert.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        }
    }
}
