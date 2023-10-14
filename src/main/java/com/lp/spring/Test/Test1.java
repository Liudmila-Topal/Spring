package com.lp.spring.Test;

import com.lp.spring.Cat;
import com.lp.spring.Dog;
import com.lp.spring.Pet;

public class Test1 {
    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();
    }
}
