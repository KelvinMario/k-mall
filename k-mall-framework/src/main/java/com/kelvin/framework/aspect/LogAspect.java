package com.kelvin.framework.aspect;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Ke1vin7
 * @since 2022/7/14 14:26
 */
@Aspect
@Component
@Slf4j
public class LogAspect {

    @AfterReturning(pointcut = "@annotation(controllerLog)",returning = "jsonResult")
    public void doAfterReturning(JoinPoint joinPoint, Log controllerLog,Object jsonResult){
        handleLog(joinPoint,controllerLog,null,jsonResult);
    }

    @AfterThrowing(pointcut = "@annotation(controllerLog)",throwing = "e")
    public void doAfterTrowing(JoinPoint joinPoint,Log controllerLog,Exception e){
        handleLog(joinPoint,controllerLog,e,null);
    }

    protected void handleLog(final JoinPoint joinPoint,Log controllerLog , final Exception e,Object jsonResult){
        // TODO 记录数据库结构待定
    }

}
