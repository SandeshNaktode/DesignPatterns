package FactoryPattern;

public class MainClass {

    public  static void main(String args []){
        System.out.println("Factory Design Pattern");
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeObj = shapeFactory.getShape(ShapEnum.CIRCLE);
        shapeObj.draw();

        shapeObj = shapeFactory.getShape(ShapEnum.RECTANGLE);
        shapeObj.draw();

        shapeObj = shapeFactory.getShape(ShapEnum.SQUARE);
        shapeObj.draw();

    }
}
