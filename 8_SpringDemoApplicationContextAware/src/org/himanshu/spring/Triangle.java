package org.himanshu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	private Point A;
	private Point B;
	private Point C;
	private ApplicationContext context=null;
		
	public Point getA() {
		return A;
	}

	public void setA(Point a) {
		
		A = a;
	}

	public Point getB() {
		return B;
	}

	public void setB(Point b) {
		B = b;
	}

	public Point getC() {
		return C;
	}

	public void setC(Point c) {
		C = c;
	}

	public void draw(){
		/*System.out.println("Point A = ("+getA().getX()+","+ getA().getY()+")");
		System.out.println("Point B= ("+getB().getX()+","+getB().getY()+")");
		System.out.println("Point C= ("+getC().getX()+","+getC().getY()+")");*/
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context=context;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("bean name is: "+ beanName);
		
	}
}
