package DecoratorDesignPattern.Pizza.Decorator;

import DecoratorDesignPattern.Pizza.Pizza;

public class CheeseDecorator extends AbstractPizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Extra Cheese(50.00)";
    }

    public double getCost() {
        return pizza.getCost() + 50.00;
    }
}
