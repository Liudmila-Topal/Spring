package aop;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Book {

    @Value("The Dark Tower")
    private String name;
}
