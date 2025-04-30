package AbstractFactoryPattern;

public class TwoDShapeFactory implements ShapeFactory{
    @Override
    public Shape createShape(String type) {
        switch(type){
            case "circle" -> {
                return new Circle();
            }
            case "rectangle" -> {
                return new Rectangle();
            }
        }
        return null;
    }
}
