package com.lp.spring;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private Pet pet;

    private String surname;

    private int age;

    public Person(){
        System.out.println("Person bean is created");
    }

//    public Person(Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    //pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
