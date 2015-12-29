package com.mts.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private static Logger logger = Logger.getLogger("MTS-Logger");

	// @Before("execution(void txr(..))")
	// public void doLogBefore(JoinPoint joinPoint) {
	// logger.info("log: calling "+joinPoint.getSignature().getName());
	// }
	//
	// @AfterReturning(pointcut = "execution(void txr(..))",returning="ret")
	// public void doLogAfterReturn(JoinPoint joinPoint,Object ret) {
	// logger.info("log: after return - " + joinPoint.getSignature().getName());
	// }

	// @AfterThrowing(pointcut = "execution(void txr(..))", throwing = "e")
	// public void doLogAfterThrowing(JoinPoint joinPoint, Throwable e) {
	// logger.info("log: after throwing - " +
	// joinPoint.getSignature().getName());
	// }

	// @After("execution(void txr(..))")
	// public void doLogAfter(JoinPoint joinPoint) {
	// logger.info("log: after - " + joinPoint.getSignature().getName());
	// }

	// @Around("execution(void txr(..))")
	// public void doLogAfter(ProceedingJoinPoint joinPoint) {
	//
	// try {
	// logger.info("log:Before..");
	// joinPoint.proceed();
	// logger.info("log:After returning");
	// } catch (Throwable e) {
	// logger.error("log: After Throwing");
	// } finally {
	// logger.info("log:After");
	// }
	//
	// }
}
