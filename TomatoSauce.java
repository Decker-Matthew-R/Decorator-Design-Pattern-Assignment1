//Decorator added to BasicPizza
public class TomatoSauce extends ToppingsAssigner
{
    public TomatoSauce(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("We have added tomato sauce to your pizza");
       
    }

    public String getDescription()
    {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost()
    {
        return tempPizza.getCost() + .10;
    } 



}
