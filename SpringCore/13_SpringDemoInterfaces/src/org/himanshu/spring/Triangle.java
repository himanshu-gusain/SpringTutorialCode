package org.himanshu.spring;

public class Triangle implements Shape{
	
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
		System.out.println("Drawing Traingle");
		System.out.println("Point A = ("+getA().getX()+","+ getA().getY()+") Point B= ("+ getB().getX()+","+getB().getY()+") Point C= ("+getC().getX()+","+getC().getY()+")");
	}
}
