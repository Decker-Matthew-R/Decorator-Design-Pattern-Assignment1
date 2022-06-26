//Decorator added to BasicPizza
public class Mushrooms extends ToppingsAssigner
{
    public Mushrooms(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("We have added mushrooms to your pizza");
       
    }

    public String getDisplay()
    {
        return tempPizza.getDisplay() + ", Mushrooms";
    }

    public double getCost()
    {
        return tempPizza.getCost() + .35;
    } 



}
