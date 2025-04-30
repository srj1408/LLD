package DecoratorPattern;

public class VegDelightBase implements BasePizza{
    @Override
    public String getDescription() {
        return "Veg Delight base";
    }

    @Override
    public int cost() {
        return 150;
    }
}
