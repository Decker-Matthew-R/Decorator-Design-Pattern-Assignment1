//This class forms the "basic pizza" that will be decorated by the decorators
public class BasicPizza implements DecoratorPizzaProject
{

    @Override
    public String getDisplay() 
    {
        return "Your pizza will be thin crust";
    }

    @Override
    public double getCost() 
    {
        return 9.75;
    }
    
}
