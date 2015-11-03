package org.himanshu.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Shape shape =(Shape)context.getBean("circle");
		//Triangle triangle =(Triangle) context.getBean("triangle");
		//triangle.draw();
		shape.draw();
	}

}
