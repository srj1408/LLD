package DecoratorPattern;

public abstract class Topping implements BasePizza{ // Topping is a base pizza
    protected BasePizza pizzaBase; // Topping has a base pizza

    public Topping(BasePizza pizzaBase){
        this.pizzaBase = pizzaBase;
    }

    public String getDescription(){
        return pizzaBase.getDescription();
    }

    public int cost(){
        return pizzaBase.cost();
    }
}
