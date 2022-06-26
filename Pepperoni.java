//Decorator added to BasicPizza
public class Pepperoni extends ToppingsAssigner
{
    public Pepperoni(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("We have added pepperoni to your pizza");
       
    }

    public String getDescription()
    {
        return tempPizza.getDescription() + ", Pepperoni";
    }

    public double getCost()
    {
        return tempPizza.getCost() + .75;
    } 



}
