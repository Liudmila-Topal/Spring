package com.lp.spring.config;

import com.lp.spring.Cat;
import com.lp.spring.Person;
import com.lp.spring.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("com.lp.spring")
public class TestConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
