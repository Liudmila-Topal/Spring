package com.lp.spring.Test;

import com.lp.spring.objects.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWithAutowired {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext/applicationContextWithAnnotations.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
