package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza margheritaBase = new MargheritaBase(); // base pizza
        BasePizza vegDelightBase = new VegDelightBase();

        ExtraCheeseTopping cheeseToppingPizza = new ExtraCheeseTopping(margheritaBase); //decorator
        System.out.println(cheeseToppingPizza.cost());

        PaneerTopping paneerToppingPizza = new PaneerTopping(vegDelightBase);
        System.out.println(paneerToppingPizza.cost());
    }
}
