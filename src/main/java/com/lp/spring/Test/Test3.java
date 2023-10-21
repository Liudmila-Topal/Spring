package com.lp.spring.Test;

//import org.springframework.context.ApplicationContext;
import com.lp.spring.objects.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("file:resources/applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
