//package sk.learning.springaop.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@Aspect
//public class BeforeAspect {
//	
//	//execution(* PACKAGE.*.*(..))
//	@Before("execution(* sk.learning.springaop.*.*(..))") //Pointcut
//	public void before(JoinPoint joinPoint) { 
//		System.out.println("Method Intercepted - "+joinPoint); //Advice
//	}
//} //pointcut + advice = aspect
