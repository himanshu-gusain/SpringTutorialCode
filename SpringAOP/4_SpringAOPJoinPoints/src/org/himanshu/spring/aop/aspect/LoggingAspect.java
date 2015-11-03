package org.himanshu.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.himanshu.spring.aop.Model.Circle;

@Aspect
public class LoggingAspect {

	// Best Practice is to combine pointcuts using logical operations

	@Before("allCircleMethods()")
	public void thirdAdvice(JoinPoint joinPoint) {
		System.out.println("Third Advice executed. Get Method is called");
		System.out.println(joinPoint.toString());
		//Circle circle=(Circle)joinPoint.getTarget();
	}
	
	@Before("args(name)")
	public void MyAdvice(String name){
		System.out.println("My advice is called: Name set is: " + name);
	}

	/**
	 * Declaring the pointcut
	 */

	@Pointcut("execution(public * get*(..))")
	public void allGetters() {
	}

	/**
	 * More readable for all the methods within the Circle class "*" for all
	 * classes inside the package "..*" for all the classes and subpackages
	 */

	@Pointcut("within(org.himanshu.spring.aop.Model.Circle)")
	public void allCircleMethods() {
	}

	/**
	 * Pointcut args() arguments the method takes Takes classname and interfaces
	 * as arguments
	 */
	// @Pointcut(args())
	public void argPointcut() {
	}
}
