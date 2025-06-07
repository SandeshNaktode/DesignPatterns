package DecoratorDesignPattern.CoffeeMachine;

public class BaseCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Base Coffee(40.00)";
    }

    @Override
    public double getCost() {
        return 40.00;
    }
}
