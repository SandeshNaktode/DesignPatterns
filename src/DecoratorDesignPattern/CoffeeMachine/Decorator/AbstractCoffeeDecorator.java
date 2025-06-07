package DecoratorDesignPattern.CoffeeMachine.Decorator;

import DecoratorDesignPattern.CoffeeMachine.Coffee;

public abstract class AbstractCoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public AbstractCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
