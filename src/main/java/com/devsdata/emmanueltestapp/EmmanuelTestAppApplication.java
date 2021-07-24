package com.devsdata.emmanueltestapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsdata.emmanueltestapp.services.ZipperService;
import com.devsdata.emmanueltestapp.dtos.UserDto;
import com.devsdata.emmanueltestapp.services.CsvService;
import com.devsdata.emmanueltestapp.services.UserService;

@SpringBootApplication
public class EmmanuelTestAppApplication {
	
	@Autowired
	CsvService csvService;
	
	@Autowired
	ZipperService zipperService;
	
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(EmmanuelTestAppApplication.class, args);
	}

	/*
	 * Helps format records into user dto
	 * @param String record the record to format
	 * @return UserDto
	 */
	public UserDto formatRecordIntoUserDto(String [] record){
	
		return UserDto.fromArrayRecord(record);
	}

}
