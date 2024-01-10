package ioc_di.Test;

import ioc_di.objects.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIniAndDestroy {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext/applicationContextInitAndDestroy.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();
    }
}
