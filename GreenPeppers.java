//Decorator added to BasicPizza
public class GreenPeppers extends ToppingsAssigner
{
    public GreenPeppers(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("We have added green peppers to your pizza");
       
    }

    public String getDescription()
    {
        return tempPizza.getDescription() + ", Green Peppers";
    }

    public double getCost()
    {
        return tempPizza.getCost() + 1.25;
    } 



}
