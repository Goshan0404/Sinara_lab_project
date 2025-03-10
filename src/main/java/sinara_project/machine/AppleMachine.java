package sinara_project.machine;

import org.springframework.stereotype.Component;

@Component
public class AppleMachine extends CoffeeMachine{
    @Override
    public void makeCoffee() {
        System.out.println("Coffee was made by Apple");
    }
}
