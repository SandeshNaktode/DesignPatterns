package DecoratorDesignPattern.CoffeeMachine.Decorator;

import DecoratorDesignPattern.CoffeeMachine.Coffee;

public class MilkDecorator extends AbstractCoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + AddOn Milk(20.00)";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20.00;
    }
}
