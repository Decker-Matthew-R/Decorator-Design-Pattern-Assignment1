//Decorator added to BasicPizza
public class Cheese extends ToppingsAssigner
{
    public Cheese(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("Thin Crust");
        System.out.println("We have added cheese to your pizza");
    }

    public String getDescription()
    {
        return tempPizza.getDescription() + ", Cheese";
    }

    public double getCost()
    {
        return tempPizza.getCost() + .50;
    } 



}