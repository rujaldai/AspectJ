package com.practise.aspectj.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(public String com.practise.aspectj..toString(..))")
    public Object updateToString(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("LoggingAspect called..!");
        String toStringValue = (String) joinPoint.proceed();
        return toStringValue.concat("-> toString updated.");
    }
}