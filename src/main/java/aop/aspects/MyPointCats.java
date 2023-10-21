package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCats {

    @Pointcut("execution(* getBook())") //getBook -> get*
    public void allGetMethods() {
    }

    @Pointcut("execution(* addBook(..))") //addBook -> add*
    public void allAddMethods() {
    }

}
