package DecoratorDesignPattern.Pizza.PizzaTypes;

import DecoratorDesignPattern.Pizza.Pizza;

public class MargheritiaPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Margheritia Pizza(100.00)";
    }

    @Override
    public double getCost() {
        return 100.00;
    }
}
