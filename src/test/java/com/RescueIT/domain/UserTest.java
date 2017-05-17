package com.RescueIT.domain;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private static Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
    
	@Test
	public void testUser() {
		//fail("Not yet implemented");
	}

	@Test
	public void testUserStringStringStringStringString() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetSetName() {
		final User user = new User();
		user.setName("name");
		Assert.assertEquals(user.getName(),"name");		
	}

	@Test
	public void testGetSetSurname() {
		final User user = new User();
		user.setSurname("surname");
		Assert.assertEquals(user.getSurname(),"surname");
	}

	@Test
	public void testGetSetUsername() {
		final User user = new User();
		user.setUsername("username");
		Assert.assertEquals(user.getUsername(),"username");	
	}

	@Test
	public void testGetSetPesel() {
		final User user = new User();
		user.setPesel("12345678901");
		Assert.assertEquals(user.getPesel(),"12345678901");	
	}

	@Test
	public void testGetSetPassword() {
		final User user = new User();
		user.setPassword("password");
		Assert.assertEquals(user.getPassword(),"password");	
	}
	
    @Test
    public void testPublicConstructor() {
        final Constructor<?>[] constructors = User.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            Assert.assertTrue(Modifier.isPublic(constructor.getModifiers()));
        }
    }
    
    @Test
    public void testCorrectUser() {
        //given:
        User user = new User("name","surname","username","12345678901","password");
 
        //when:
        Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertTrue(violations.isEmpty());
    }
 
    @Test
    public void testToShortName() {
        //given too short name:
    	User user = new User("n","surname","username","12345678901","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Długosć imienia powinna mieścić się w przedziale od 2 do 30 znaków}", violation.getMessage());
    }
    
    @Test
    public void testToLongName() {
        //given too short name:
    	User user = new User("Daenerys Zrodzona z Burzy, Niespalona","surname","username","12345678901","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Długosć imienia powinna mieścić się w przedziale od 2 do 30 znaków}", violation.getMessage());
    }
    
    @Test
    public void testToShortSurname() {
        //given too short name:
    	User user = new User("name","s","username","12345678901","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Długosć nazwiska powinna mieścić się w przedziale od 2 do 30 znaków}", violation.getMessage());
    }
    
    @Test
    public void testToLongSurname() {
        //given too short name:
    	User user = new User("name","Daenerys Zrodzona z Burzy, Niespalona","username","12345678901","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Długosć nazwiska powinna mieścić się w przedziale od 2 do 30 znaków}", violation.getMessage());
    }
    
    @Test
    public void testToShortUsername() {
        //given too short name:
    	User user = new User("name","surname","usern","12345678901","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Nazwa użytkownika powinna mieścić się w przedziale od 6 do 12 znaków}", violation.getMessage());
    }
    
    @Test
    public void testToLongUsername() {
        //given too short name:
    	User user = new User("name","surname","username@gmail.com","12345678901","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Nazwa użytkownika powinna mieścić się w przedziale od 6 do 12 znaków}", violation.getMessage());
    }
    
    @Test
    public void testPeselValidation() {
        //given too short name:
    	User user = new User("name","surname","username","123456789","password");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Błędny numer PESEL}", violation.getMessage());
    }
    
    @Test
    public void testPasswordValidation() {
        //given too short name:
    	User user = new User("name","surname","username","12345678901","passwordpassword");
 
        //when:
    	Set<ConstraintViolation<User>> violations = validator.validate(user);
 
        //then:
        assertEquals(violations.size(),1);
 
        ConstraintViolation<User> violation = violations.iterator().next();
        assertEquals("{Hasło powinno zawierać od 6 do 12 znaków}", violation.getMessage());
    }
}
