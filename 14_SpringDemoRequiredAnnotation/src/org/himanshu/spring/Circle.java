package org.himanshu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center;
	

	public Point getCenter() {
		return center;
	}

	@Required
	@Autowired
	@Qualifier("circle")
	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		System.out.println("center is (" + getCenter().getX()+ ","+ getCenter().getY()+")");
	}

}
