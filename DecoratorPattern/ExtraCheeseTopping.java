package DecoratorPattern;

public class ExtraCheeseTopping extends Topping{
    public ExtraCheeseTopping(BasePizza pizzaBase) {
        super(pizzaBase);
    }

    public String getDescription(){
        return pizzaBase.getDescription()+" + extra cheese";
    }

    public int cost(){
        return pizzaBase.cost()+20;
    }
}
