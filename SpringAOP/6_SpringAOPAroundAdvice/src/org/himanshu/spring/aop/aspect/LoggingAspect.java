package org.himanshu.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	
	@After("args(name)")
	public void MyAdvice(String name){
		System.out.println("My advice is called: Name set is: " + name);
	}
	
	@Around("allGetters()")
	public void MyAroundAdvice(ProceedingJoinPoint proceedingJoinPoint ){
		
		try {
			System.out.println("Before target method executed in Around Advice");
			//Actual target method is called
			proceedingJoinPoint.proceed();
			System.out.println("Afte target method is executed");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finally");
	}
	
	
	@AfterReturning("args(name)")
	public void MyAdviceReturn(String name){
		System.out.println("My method is returned successfully ");
	}

	@AfterThrowing("args(name)")
	public void ExceptionAdvice(String name){
		System.out.println("My method is returns exception");
	}
	
	@AfterReturning(pointcut="args(name)",returning="returnString")
	public void HandleObjectReturnedAdvice(String name, Object returnString ){
		System.out.println("My method is returned successfully an object and its value is : " + returnString);
	}
	
	@AfterThrowing(pointcut="args(name)", throwing="ex")
	public void ExceptionAdviceReturningException(String name, Exception ex){
		System.out.println("My method is returns exception. The eception is: " + ex.getMessage() );
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
