package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniversityLibrary.add*())")
//    private void allAddMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void combinationFirstAndSecondPointcut(){}

    @Pointcut("execution(* aop.UniversityLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(public void aop.UniversityLibrary.returnBook())")
    private void returnBookFromUniversity(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnBookFromUniversity()")
    private void withoutReturnBookFromUniversity(){}

    @Before("withoutReturnBookFromUniversity()")
    public void beforeWithoutReturnLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: Log #10");
    }

//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: Log #2");
//    }
//
//    @Before("allAddMethodsFromUniLibrary()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: Log #3");
//    }
//
//    @Before("combinationFirstAndSecondPointcut()")
//    public void beforeFirstTwoLoggingAdvice(){
//        System.out.println("beforeFirstTwoLoggingAdvice: Log #4");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}

//    @Before("execution(public void getBook())") //for all getBook() methods
//    public void beforeAllGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: we're trying to get book");
//    }
//
//    @Before("execution(public void aop.UniversityLibrary.getBook())") //just for UniversityLibrary
//    public void beforeUniqueGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice: we're trying to get book");
//    }
//
//    @Before("execution(public void get*())") //for all methods which is start with 'get'
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: we're trying to get book");
//    }
//
//    @Before("execution(* returnBook())")
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeGetBookAdvice: we're trying to return book");
//    }

//    @Before("execution(public void getBookWithParameter(aop.Book))") // aop.Book, ..
//    public void beforeGetBookAdviceWithParameter(){
//        System.out.println("beforeGetBookAdvice: we're trying to get book");
//    }
//
//    @Before("execution(public void getBookWithParameter(*/..))") // *(one parameter), ..(a lot of parameters)
//    public void beforeGetBookAdviceWithParam(){
//        System.out.println("beforeGetBookAdvice: we're trying to get book");
//    }

//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvices(){
//        System.out.println("beforeGetLoggingAdvices: we're trying to get book or magazine");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvices(){
//        System.out.println("beforeGetSecurityAdvices: check access");
//    }
}
