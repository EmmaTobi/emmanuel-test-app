package com.devsdata.emmanueltestapp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsdata.emmanueltestapp.dtos.UserDto;

@Service
public class UserService {
	
	@Value("${POST_URL}")
	public String POST_URL;
	
	/*
	 * Helps post user data to endpont
	 * @param String path
	 * @return List<List<String>>  
	 */
	public UserDto postUser(UserDto userDto) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<UserDto> request = new HttpEntity<>(userDto);
		return restTemplate.postForObject(POST_URL, request, UserDto.class);
	}

}
