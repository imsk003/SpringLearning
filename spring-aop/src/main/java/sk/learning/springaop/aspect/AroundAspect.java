package sk.learning.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class AroundAspect {
	
	//execution(* PACKAGE.*.*(..))
	@Around("execution(* sk.learning.springaop.DAO1.retrieveData())") //Pointcut
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable { 
		long startTime = System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		System.out.println("Time taken by "+proceedingJoinPoint+" is "+timeTaken); //Advice
	}
} //pointcut + advice = aspect
