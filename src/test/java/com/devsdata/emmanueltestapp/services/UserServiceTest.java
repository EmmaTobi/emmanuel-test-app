package com.devsdata.emmanueltestapp.services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class UserServiceTest {

	
	@BeforeEach
	public void init() {
		
	}
	
	/*
	 * Test post user data to api endpoint
	 */
	@Test
	@DisplayName("Test Post User")
    public void testPostUser() {
		
	}
}
