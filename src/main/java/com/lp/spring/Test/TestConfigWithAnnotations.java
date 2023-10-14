package com.lp.spring.Test;

import com.lp.spring.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConfigWithAnnotations {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextWithAnnotations.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();

        context.close();
    }
}
