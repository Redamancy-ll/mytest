package edu.soft2.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component//声明组件类
//@Aspect//声明切面类
public class HelloworldAspect {
    //设置切点
    @Pointcut("execution(* edu.soft2.service..*.*(..))")
    public void myPointcut(){}
    /**
     * 前置增强
     */
    @Before("myPointcut()")
    public void beforeAdvice(){
        System.out.println("——前置通知(先执行这里)——");
    }
    /**
     * 后置增强
     */
    @After("myPointcut()")
    public void afterAdvice(){
        System.out.println("——后置通知(后执行这里)——");
    }

}
