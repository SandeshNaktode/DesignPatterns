package DecoratorDesignPattern.CoffeeMachine;

import DecoratorDesignPattern.CoffeeMachine.Decorator.MilkDecorator;
import DecoratorDesignPattern.CoffeeMachine.Decorator.SugarDecorator;
import DecoratorDesignPattern.CoffeeMachine.Decorator.WhippedCreamDecorator;

public class MainCoffeeStore {
    public static void main(String[] args) {
        Coffee coffee = new BaseCoffee();
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        coffee = new WhippedCreamDecorator(coffee);

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost());
    }
}
