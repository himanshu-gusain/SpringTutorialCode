package org.himanshu.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	
	private Point A;
	private Point B;
	private Point C;
	
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
		System.out.println("Point A = ("+getA().getX()+","+ getA().getY()+") Point B= ("+ getB().getX()+","+getB().getY()+") Point C= ("+getC().getX()+","+getC().getY()+")");
	}

	public void myInit(){
		System.out.println("Initializing bean ");
	}
	
	public void myDestroy(){
		System.out.println("Destroying the beans");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initializing bean init method called for Triangle");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean destroy method called for Triangle");
		
	}
}
