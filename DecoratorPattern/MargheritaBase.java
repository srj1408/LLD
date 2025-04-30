package DecoratorPattern;

public class MargheritaBase implements BasePizza{

    @Override
    public String getDescription() {
        return "Margherita base";
    }

    @Override
    public int cost() {
        return 100;
    }
}
