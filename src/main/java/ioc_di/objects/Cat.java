package ioc_di.objects;

import ioc_di.Pet;

//@Component("catBean")
public class Cat implements Pet {

    public Cat(){
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
