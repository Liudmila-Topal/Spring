package com.lp.spring;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Dog implements Pet {

    private String name;

    public void init() {
        System.out.println("Dog class: init method");
    }

    public void destroy() {
        System.out.println("Dog class: destroy method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-bow");
    }
}