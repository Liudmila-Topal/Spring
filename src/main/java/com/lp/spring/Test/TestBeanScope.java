package com.lp.spring.Test;

import com.lp.spring.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextBeanScope.xml"); // by default - Singleton

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

//        System.out.println("Object for both dogs is the same: " + (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
}
