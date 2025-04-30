package AbstractFactoryPattern;

public class FactoryProducer {
    public static ShapeFactory getFactory(String dimension){ //returns group of products
        switch (dimension){
            case "2d" -> {
                return new TwoDShapeFactory();
            }
            case "3d" -> {
                return new ThreeDShapeFactory();
            }
        }
        return null;
    }
}
