package com.devsdata.emmanueltestapp.dtos;

import java.util.List;

public class UserDto {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private List<String> paramOne;
	
	private List<String> paramTwo;
	
	private List<String> paramThree;
	
	private List<String> paramFour;
	
	private List<String> paramFive;
	
	private List<String> paramSix;
	
	private List<String> paramSeven;
	
	private List<String> paramEight;
	
	private List<String> paramNine;
	
	private List<String> paramZero;

	public UserDto(String firstName, String lastName, String email, List<String> paramOne, List<String> paramTwo, List<String> paramThree,
			List<String> paramFour, List<String> paramFive, List<String> paramSix, List<String> paramSeven, List<String> paramEight, List<String> paramNine,
			List<String> paramZero) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.paramOne = paramOne;
		this.paramTwo = paramTwo;
		this.paramThree = paramThree;
		this.paramFour = paramFour;
		this.paramFive = paramFive;
		this.paramSix = paramSix;
		this.paramSeven = paramSeven;
		this.paramEight = paramEight;
		this.paramNine = paramNine;
		this.paramZero = paramZero;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getParamOne() {
		return paramOne;
	}

	public void setParamOne(List<String> paramOne) {
		this.paramOne = paramOne;
	}

	public List<String> getParamTwo() {
		return paramTwo;
	}

	public void setParamTwo(List<String> paramTwo) {
		this.paramTwo = paramTwo;
	}

	public List<String> getParamThree() {
		return paramThree;
	}

	public void setParamThree(List<String> paramThree) {
		this.paramThree = paramThree;
	}

	public List<String> getParamFour() {
		return paramFour;
	}

	public void setParamFour(List<String> paramFour) {
		this.paramFour = paramFour;
	}

	public List<String> getParamFive() {
		return paramFive;
	}

	public void setParamFive(List<String> paramFive) {
		this.paramFive = paramFive;
	}

	public List<String> getParamSix() {
		return paramSix;
	}

	public void setParamSix(List<String> paramSix) {
		this.paramSix = paramSix;
	}

	public List<String> getParamSeven() {
		return paramSeven;
	}

	public void setParamSeven(List<String> paramSeven) {
		this.paramSeven = paramSeven;
	}

	public List<String> getParamEight() {
		return paramEight;
	}

	public void setParamEight(List<String> paramEight) {
		this.paramEight = paramEight;
	}

	public List<String> getParamNine() {
		return paramNine;
	}

	public void setParamNine(List<String> paramNine) {
		this.paramNine = paramNine;
	}

	public List<String> getParamZero() {
		return paramZero;
	}

	public void setParamZero(List<String> paramZero) {
		this.paramZero = paramZero;
	}

	public static UserDto fromArrayRecord(String[] record) {
		if(record.length < 13 ) {
			return null;
		}
		return null;
	}

}
