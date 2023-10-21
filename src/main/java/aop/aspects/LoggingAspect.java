package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniversityLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniversityLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void combinationFirstAndSecondPointcut(){}

//    @Pointcut("execution(?houtReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: Log #10");
//    }

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
    @Before("aop.aspects.MyPointCats.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        Method method = methodSignature.getMethod();
        System.out.println("method = " + method);
        Class returnType = methodSignature.getReturnType();
        System.out.println("returnType = " + returnType);
        String name = method.getName();
        System.out.println("name = " + name);

        if (methodSignature.getName().equals("addBook")) {
            Object[] arg = joinPoint.getArgs();
            for (Object obj : arg) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Info about book: book name = " + myBook.getName() +
                            ", author = " + myBook.getAuthor() +
                            ", year of publication = " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println(obj + " added book to university");
                }
            }
        }

        System.out.println("beforeAddLoggingAdvice: add book");
        System.out.println("------------------------------");
    }
//
//    @Before("combinationFirstAndSecondPointcut()")
//    public void beforeFirstTwoLoggingAdvice(){
//        System.out.println("beforeFirstTwoLoggingAdvice: Log #4");
//    }


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
//    }
//
//    @Before("execution(public void getBookWithParameter(*/..))") // *(one parameter), ..(a lot of parameters)
//    public void beforeGetBookAdviceWithParam(){
//        System.out.println("beforeGetBookAdvice: we're trying to get book");
//    }

    @Before("aop.aspects.MyPointCats.allGetMethods()")
    public void beforeGetLoggingAdvices() {
        System.out.println("beforeGetLoggingAdvices: we're trying to get book or magazine");
        System.out.println("------------------------------");
    }
}
