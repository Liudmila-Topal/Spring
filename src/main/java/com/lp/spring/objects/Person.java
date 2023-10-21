package com.lp.spring.objects;


import com.lp.spring.Pet;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component("personBean")
public class Person {

//    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

    @Value("${person.surname}")
    private String surname;

    @Value("${person.age}")
    private int age;

    public Person(){
        System.out.println("Person bean is created");
    }

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("catBean")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
