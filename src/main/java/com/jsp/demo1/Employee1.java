package com.jsp.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee1 {

	int id;
	String name;
	String email;

	@Value(value = "102")
	public void setId(int id) {
		this.id = id;
	}

	@Value(value = "sejal")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "sejal@mail.com")
	public void setEmail(String email) {
		this.email = email;
	}

	public void print1() {
		System.out.println("ID is    : " + id);
		System.out.println("Name is  : " + name);
		System.out.println("Email is : " + email);
	}

}
