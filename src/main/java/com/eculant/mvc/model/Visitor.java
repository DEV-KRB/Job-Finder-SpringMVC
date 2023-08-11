package com.eculant.mvc.model;

import java.util.Arrays;
import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.eculant.mvc.validation.ConCode;

public class Visitor {


	@NotNull(message="is required")
	@Size(message="is required", min=1)
	private String firstName;
	
	private String lastName;
	
	private String city;
	
	private LinkedHashMap<String, String> cityOptions;
	
	private String relocate;
	
	private String[] languagesKnown;
	
	@ConCode
	private String conCode;

	public Visitor(){
		
		//populate country options
		cityOptions = new LinkedHashMap<>();
		cityOptions.put("BOB", "Mumbai");
		cityOptions.put("IDR", "Indore");
		cityOptions.put("DL", "Delhi");
		cityOptions.put("MAS", "Chennai");
		cityOptions.put("BR", "Banglore");
	}

	public Visitor(String firstName, String lastName, String city, LinkedHashMap<String, String> cityOptions,
			String relocate, String[] languagesKnown) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.cityOptions = cityOptions;
		this.relocate = relocate;
		this.languagesKnown = languagesKnown;
	}

	@Override
	public String toString() {
		return "Visitor [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", cityOptions="
				+ cityOptions + ", relocate=" + relocate + ", languagesKnown=" + Arrays.toString(languagesKnown) + "]";
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LinkedHashMap<String, String> getCityOptions() {
		return cityOptions;
	}

	public void setCityOptions(LinkedHashMap<String, String> cityOptions) {
		this.cityOptions = cityOptions;
	}

	public String getRelocate() {
		return relocate;
	}

	public void setRelocate(String relocate) {
		this.relocate = relocate;
	}

	public String[] getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String[] languagesKnown) {
		this.languagesKnown = languagesKnown;
	}
	
	public String getConCode() {
		return conCode;
	}

	public void setConCode(String conCode) {
		this.conCode = conCode;
	}
	
}
