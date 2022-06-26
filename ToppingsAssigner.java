//Assigns the variable newPizza and calls the object to be decorated by both description and cost.
abstract class ToppingsAssigner implements DecoratorPizzaProject
{
    protected DecoratorPizzaProject tempPizza;

    public ToppingsAssigner(DecoratorPizzaProject newPizza)
    {
        tempPizza = newPizza;

    }

    public String getDisplay()
    {
        return tempPizza.getDisplay();
    }

    public double getCost()
    {
        return tempPizza.getCost();
    }
}
