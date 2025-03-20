package sinara_project.machine;

import org.springframework.stereotype.Component;

@Component
public class LenovoMachine extends CoffeeMachine {

    @Override
    public void makeCoffee() {
        System.out.println("Coffee was made by Lenovo");
    }
}
