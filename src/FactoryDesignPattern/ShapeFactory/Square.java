package FactoryDesignPattern.ShapeFactory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw: Square");
    }
}
