package ioc_di.Test;

import ioc_di.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext/applicationContext.xml");

        Pet dog = context.getBean("myPet", Pet.class);
        dog.say();

        context.close();
    }
}
