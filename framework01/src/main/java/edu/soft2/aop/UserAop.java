package edu.soft2.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAop {
    @Around("execution(* edu.soft2.service.UserService.addUser(..))")
    public Object aroundAdd(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强");
        return result;
    }
    @Around("execution(* edu.soft2.service.UserService.deleUser(..))")
    public Object aroundDelete(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强");
        return result;
    }
    @Around("execution(* edu.soft2.service.UserService.update(..))")
    public Object aroundUpdate(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强");
        return result;
    }
    @Around("execution(* edu.soft2.service.UserService.queryUser(..))")
    public Object aroundQuery(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println(pjp.getSignature().getName()+"方法的前置环绕增强");
        Object result = pjp.proceed();
        System.out.println(pjp.getSignature().getName()+"方法的后置环绕增强");
        return result;
    }

//    private static final Logger log = Logger.getLogger(UserAop.class);
//    @Pointcut("execution(* edu.soft2.service..*.*(..))")
//    public void pointA(){}
//    @Before(value = "pointA()")
//    public void beforeA(){System.out.println("userAop前置");}
//    @After(value = "pointA()")
//    public void afterA(){System.out.println("userAop后置");}
//    @Around(value = "pointA()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        Object res = null;
////        System.out.println("前环绕增强");//环绕增强的前环绕
//        System.out.println("执行目标对象"+pjp.getTarget()+"的"+pjp.getSignature().getName()+"()方法");
//        res = pjp.proceed();//执行方法
//        System.out.println("已经执行目标对象"+pjp.getTarget()+"的"+pjp.getSignature().getName()+"()方法");
//        return res;
////        System.out.println("后环绕增强");
//    }
//    @AfterReturning(value = "pointA()",returning = "result")
//    public void afterRe(JoinPoint jp,Object result){
//        System.out.println("执行完毕"+jp.getTarget()+"的"+jp.getSignature().getName()+"()方法，返回值为"+result);
//    }
}
