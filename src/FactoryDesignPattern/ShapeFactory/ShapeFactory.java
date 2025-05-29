package FactoryDesignPattern.ShapeFactory;

public class ShapeFactory {

    public Shape getShape(ShapEnum input){
        switch(input){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return null;
        }
    }
}
