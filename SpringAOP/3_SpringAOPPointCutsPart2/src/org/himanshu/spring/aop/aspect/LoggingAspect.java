package org.himanshu.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/**
	 * To a particular class
	 */
	
	/*@Before("execution(public String org.himanshu.spring.aop.Model.Circle.getName())")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method is called");
	}*/
	
	/*
	 * One Advice to multiple methods using Wildcards
	 * "*" for atleast one argument
	 * ".." for one or more arguments
	 * We can also apply this to with package
	 * */
	
	/*@Before("execution(public * get*(..))")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method is called");
	}*/
	
	/**
	 * Using Pointcut for more advices
	 * write allGetters or a dummy method method in the @Before annotation of all the advices
	 */
	
	/*@Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("Second Advice executed. Get Method is called");
	}*/
	@Before("allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method is called");
	}
	@Before("allGetters()")
	public void SecondAdvice(){
		System.out.println("Second Advice executed. Get Method is called");
	}
	/**
	 * Declaring the pointcut
	 * */
	
	@Pointcut("execution(public * get*(..))")
	public void allGetters(){}
	
	/**
	 * More readable for all the methods within the Circle class
	 * "*" for all classes inside the package
	 * "..*" for all the classes and subpackages
	 * */
	
	@Pointcut("within(org.himanshu.spring.aop.Model.Circle)")
	public void allCircleMethods(){}
	
	
	//Best Practice is to combine pointcuts using logical operations
	
	@Before("allGetters() && allCircleMethods()")
	public void thirdAdvice(){
		System.out.println("Third Advice executed. Get Method is called");
	}
	
	
	/**
	 * Pointcut args()
	 * arguments the method takes
	 * Takes classname and interfaces as arguments
	 * */
	//@Pointcut(args())
	public void argPointcut(){}
}
