package com.lp.spring.Test;

import com.lp.spring.objects.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext/applicationContextWithAnnotations.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dog", Dog.class);
//
//        System.out.println("Objects have the same path: " + (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);

        context.close();
    }
}
