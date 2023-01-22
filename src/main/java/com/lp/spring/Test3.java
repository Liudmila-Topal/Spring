package com.lp.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
