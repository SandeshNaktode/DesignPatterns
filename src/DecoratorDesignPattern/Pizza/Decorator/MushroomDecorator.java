package DecoratorDesignPattern.Pizza.Decorator;

import DecoratorDesignPattern.Pizza.Pizza;

public class MushroomDecorator extends AbstractPizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " + Mushroom Toppings(30.00)";
    }

    public double getCost() {
        return pizza.getCost() + 30.00;
    }
}
