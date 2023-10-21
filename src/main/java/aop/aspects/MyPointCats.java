package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCats {

    @Pointcut("execution(* get*())")
    public void allGetMethods() {
    }

}
