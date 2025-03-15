package sinara_project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Seller {
    private final String Name;
    private final String age;

    public Seller(@Value("${seller.name:Default Seller}") String name, @Value("${seller.age:Default Undefined}") String age) {
        Name = name;
        this.age = age;
    }
}
