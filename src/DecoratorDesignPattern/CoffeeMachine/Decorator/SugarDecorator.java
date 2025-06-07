package DecoratorDesignPattern.CoffeeMachine.Decorator;

import DecoratorDesignPattern.CoffeeMachine.Coffee;

public class SugarDecorator extends AbstractCoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + AddOn Sugar(10.00)";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.00;
    }
}
