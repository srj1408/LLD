package AbstractFactoryPattern;

public class ThreeDShapeFactory implements ShapeFactory{
    @Override
    public Shape createShape(String type) {
        switch (type){
            case "sphere" -> {
                return new Sphere();
            }
            case "cube" -> {
                return new Cube();
            }
        }
        return null;
    }
}
