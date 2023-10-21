package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("aop.aspects.MyPointCats.allGetMethods()")
    public void beforeGetExceptionHandlingAdvice(){
        System.out.println("beforeGetExceptionHandlingAdvice: find exceptions");
        System.out.println("------------------------------");
    }

    @Before("aop.aspects.MyPointCats.allAddMethods()")
    public void beforeAddLoggingAdvice(){
        System.out.println("beforeAddLoggingAdvice: before add book we need to find exceptions");
        System.out.println("------------------------------");
    }
}
