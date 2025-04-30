package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory twoDFactory = FactoryProducer.getFactory("2d"); //get group of product
        assert twoDFactory != null;
        Shape circle = twoDFactory.createShape("circle"); //get product
        circle.draw();

        ShapeFactory threeDFactory = FactoryProducer.getFactory("3d");
        assert threeDFactory != null;
        Shape sphere = threeDFactory.createShape("sphere");
        sphere.draw();

    }
}
