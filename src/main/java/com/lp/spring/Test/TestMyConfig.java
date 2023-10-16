package com.lp.spring.Test;

import com.lp.spring.Person;
import com.lp.spring.Pet;
import com.lp.spring.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMyConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfig.class);

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();

        context.close();
    }
}
