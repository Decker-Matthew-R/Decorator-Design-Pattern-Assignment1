//Decorator added to BasicPizza
public class Mushrooms extends ToppingsAssigner
{
    public Mushrooms(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("We have added mushrooms to your pizza");
       
    }

    public String getDescription()
    {
        return tempPizza.getDescription() + ", Mushrooms";
    }

    public double getCost()
    {
        return tempPizza.getCost() + .35;
    } 



}
