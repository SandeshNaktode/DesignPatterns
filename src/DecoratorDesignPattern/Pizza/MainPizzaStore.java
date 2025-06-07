package DecoratorDesignPattern.Pizza;

import DecoratorDesignPattern.Pizza.Decorator.CheeseDecorator;
import DecoratorDesignPattern.Pizza.Decorator.MushroomDecorator;
import DecoratorDesignPattern.Pizza.Decorator.OliveDecorator;
import DecoratorDesignPattern.Pizza.PizzaTypes.FarmHouse;
import DecoratorDesignPattern.Pizza.PizzaTypes.MargheritiaPizza;
import DecoratorDesignPattern.Pizza.PizzaTypes.VegDelight;

public class MainPizzaStore {
    public static void main(String[] args) {
        Pizza margheritiaPizza = new MargheritiaPizza();
        margheritiaPizza = new CheeseDecorator(margheritiaPizza);
        margheritiaPizza = new MushroomDecorator(margheritiaPizza);
        margheritiaPizza = new OliveDecorator(margheritiaPizza);

        System.out.println("Discription: " + margheritiaPizza.getDescription());
        System.out.println("Total Cost: " + margheritiaPizza.getCost());

        Pizza vegDelight = new VegDelight();
        vegDelight = new CheeseDecorator(vegDelight);
        vegDelight = new MushroomDecorator(vegDelight);
        vegDelight = new OliveDecorator(vegDelight);

        System.out.println("Discription: " + vegDelight.getDescription());
        System.out.println("Total Cost: " + vegDelight.getCost());

        Pizza farmHouse = new FarmHouse();
        farmHouse = new CheeseDecorator(farmHouse);
        farmHouse = new MushroomDecorator(farmHouse);
        farmHouse = new OliveDecorator(farmHouse);

        System.out.println("Discription: " + farmHouse.getDescription());
        System.out.println("Total Cost: " + farmHouse.getCost());
    }
}
