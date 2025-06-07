package DecoratorDesignPattern.CoffeeMachine.Decorator;

import DecoratorDesignPattern.CoffeeMachine.Coffee;

public class WhippedCreamDecorator extends AbstractCoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + AddOn Cream(30.00)";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 30.00;
    }
}
