package com.jsp.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Employee1Driver {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		Employee1 employee1 = (Employee1) applicationContext.getBean("employee1");
		employee1.print1();

	}

}
