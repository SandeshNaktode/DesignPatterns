package DecoratorDesignPattern.Pizza.PizzaTypes;

import DecoratorDesignPattern.Pizza.Pizza;

public class VegDelight implements Pizza {
    @Override
    public String getDescription() {
        return "Veg Delight Pizza(150.00)";
    }

    @Override
    public double getCost() {
        return 150.00;
    }
}
