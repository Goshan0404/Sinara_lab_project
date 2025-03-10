package sinara_project;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sinara_project.machine.CoffeeMachine;
import java.util.logging.Logger;


@Component
public class CoffeeStore {

    private static final Logger logger = Logger.getLogger(CoffeeStore.class.getName());

    @Autowired
    private Seller seller;

    private DurationOpen durationOpen;
    private final CoffeeMachine coffeeMachine;

    public CoffeeStore(@Qualifier("lenovoMachine") CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @PostConstruct
    private void postConstruct() {
        logger.info("Been init");
    }

    @Autowired
    public void setDurationOpen(DurationOpen durationOpen) {
        this.durationOpen = durationOpen;
    }

    public void orderCoffee() {
        coffeeMachine.makeCoffee();
    }


    @PreDestroy
    public void preDestroy() {
        logger.info("Been destroyed");
    }
}
