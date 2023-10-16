package aop.test;

import aop.Book;
import aop.SchoolLibrary;
import aop.UniversityLibrary;
import aop.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
//        Book book = context.getBean("book", Book.class);
//        universityLibrary.getBookWithParameter(book);



        universityLibrary.getBook();
//        universityLibrary.returnBook();
//        universityLibrary.getMagazine();
//        universityLibrary.addBook();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
