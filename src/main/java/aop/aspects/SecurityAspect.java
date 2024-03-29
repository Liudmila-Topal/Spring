package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspects.MyPointCats.allGetMethods()")
    public void beforeGetSecurityAdvices(){
        System.out.println("beforeGetSecurityAdvices: check access");
        System.out.println("------------------------------");
    }

    @Before("aop.aspects.MyPointCats.allAddMethods()")
    public void beforeAddLoggingAdvice(){
        System.out.println("beforeAddLoggingAdvice: before add book we need to check the access");
        System.out.println("------------------------------");
    }
}
