package aop.test;

import aop.Library;
import aop.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();

        context.close();
    }
}
