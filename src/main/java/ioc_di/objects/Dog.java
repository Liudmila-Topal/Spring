package ioc_di.objects;


import ioc_di.Pet;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Component
//@Scope("prototype")
public class Dog implements Pet {

    private String name;

//    @PostConstruct
    public void init() {
        System.out.println("Dog class: init method");
    }

//    @PreDestroy
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