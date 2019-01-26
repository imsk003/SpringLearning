//package sk.learning.springaop.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@Aspect
//public class AfterAspect {
//	
//	//execution(* PACKAGE.*.*(..))
//	@After("execution(* sk.learning.springaop.DAO1.retrieveData())") //Pointcut
//	public void after(JoinPoint joinPoint) { 
//		System.out.println(joinPoint+" is executed"); //Advice
//	}
//	
//	@AfterReturning(
//			value="execution(* sk.learning.springaop.DAO1.retrieveData())",
//			returning="result"
//			) //Pointcut
//	public void afterReturning(JoinPoint joinPoint, Object result) { 
//		System.out.println(joinPoint+" returns "+result); //Advice
//	}
//	
//	@AfterThrowing(
//			value="execution(* sk.learning.springaop.DAO1.retrieveData())",
//			throwing="exp"
//			) //Pointcut
//	public void afterThrowing(JoinPoint joinPoint, Exception exp) { 
//	System.out.println(joinPoint+" throwing "+exp); //Advice
//	}
//} //pointcut + advice = aspect
