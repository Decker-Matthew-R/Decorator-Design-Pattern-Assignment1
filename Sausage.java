//Decorator added to BasicPizza
public class Sausage extends ToppingsAssigner
{
    public Sausage(DecoratorPizzaProject newPizza)
    {
        super(newPizza);

        System.out.println("We have added sausage to your pizza");
       
    }

    public String getDescription()
    {
        return tempPizza.getDescription() + ", Sausage";
    }

    public double getCost()
    {
        return tempPizza.getCost() + 2.15;
    } 



}
