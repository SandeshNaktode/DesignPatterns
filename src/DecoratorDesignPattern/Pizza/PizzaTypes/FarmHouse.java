package DecoratorDesignPattern.Pizza.PizzaTypes;

import DecoratorDesignPattern.Pizza.Pizza;

public class FarmHouse implements Pizza {

    @Override
    public String getDescription() {
        return "Farm House Pizza(200.00) ";
    }

    @Override
    public double getCost() {
        return 200.00;
    }
}
