package DecoratorDesignPattern.Pizza.Decorator;

import DecoratorDesignPattern.Pizza.Pizza;

public abstract class AbstractPizzaDecorator implements Pizza {
    protected Pizza pizza;

    public AbstractPizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}
