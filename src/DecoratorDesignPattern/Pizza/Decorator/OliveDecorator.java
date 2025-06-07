package DecoratorDesignPattern.Pizza.Decorator;

import DecoratorDesignPattern.Pizza.Pizza;

public class OliveDecorator extends AbstractPizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Olive Toppings(20.00)";
    }

    public double getCost() {
        return pizza.getCost() + 20.00;
    }
}
