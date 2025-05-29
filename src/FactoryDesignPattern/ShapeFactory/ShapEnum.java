package FactoryDesignPattern.ShapeFactory;

public enum ShapEnum {
    CIRCLE("CIRCLE"),
    RECTANGLE("RECTANGLE"),
    SQUARE("SQUARE");

    String value;

    ShapEnum(String shape) {
        this.value = shape;
    }

    public String getValue() {
        return value;
    }
}
