package ioc_di.Test;

import ioc_di.objects.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigWithAnnotations {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext/applicationContextWithAnnotations.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();

        context.close();
    }
}
