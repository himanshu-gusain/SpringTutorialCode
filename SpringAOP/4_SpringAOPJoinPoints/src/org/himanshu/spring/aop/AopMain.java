package org.himanshu.spring.aop;

import org.himanshu.spring.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String args[]) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		//System.out.println(shapeService.getCircle().getName() +" " + shapeService.getTriangle().getName());
		System.out.println(shapeService.getCircle().getName());
		shapeService.getCircle().setName("himanshu");
	} 
}
