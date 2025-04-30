package DecoratorPattern;

public class PaneerTopping extends Topping{
    public PaneerTopping(BasePizza pizzaBase) {
        super(pizzaBase);
    }

    public String getDescription(){
        return pizzaBase.getDescription()+" + paneer";
    }

    public int cost(){
        return pizzaBase.cost()+50;
    }
}
