package ioc_di.Test;

import ioc_di.objects.Cat;
import ioc_di.objects.Dog;
import ioc_di.Pet;

public class Test1 {
    public static void main(String[] args) {
        Pet dog = new Dog();
        dog.say();

        Pet cat = new Cat();
        cat.say();
    }
}
