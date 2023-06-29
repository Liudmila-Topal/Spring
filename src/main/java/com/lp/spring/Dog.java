package com.lp.spring;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog implements Pet{

    private String name;

    public Dog(){
        System.out.println("Dog bean is created");
    }
    @Override
    public void say(){
        System.out.println("Bow-bow");
    }

    public void init(){
        System.out.println("Class Dog: Init method");
    }

    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
