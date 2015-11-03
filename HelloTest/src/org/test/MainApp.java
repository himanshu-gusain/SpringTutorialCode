package org.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
			Hello obj = (Hello)ctx.getBean("hello");
			System.out.println("Message is : " + obj.getMessage());
	}

}
