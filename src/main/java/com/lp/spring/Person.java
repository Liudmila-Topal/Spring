package com.lp.spring;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component("personBean")
public class Person {

    @Autowired
    private Pet pet;

    private String surname;

    private int age;

    public Person(){
        System.out.println("Person bean is created");
    }

//    @Autowired
//    public Person(Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
