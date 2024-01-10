package ioc_di.config;

import ioc_di.objects.Cat;
import ioc_di.objects.Person;
import ioc_di.Pet;
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
