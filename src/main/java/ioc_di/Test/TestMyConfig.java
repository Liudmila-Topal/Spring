package ioc_di.Test;

import ioc_di.config.TestConfig;
import ioc_di.objects.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfig.class);

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
//        person.callYourPet();

//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();

        context.close();
    }
}
