//Main Class that compiles decorators and prints results of ingredients added
public class PizzaGUI 
{
    public static void main (String[] args)
    {
        DecoratorPizzaProject plainPizza = new Sausage(new Mushrooms(new GreenPeppers(new Pepperoni(new TomatoSauce(new Cheese(new BasicPizza()))))));

        System.out.println("Ingredients: " + plainPizza.getDisplay());

        System.out.println("Cost: $" + plainPizza.getCost() + " + tax. Enjoy!");
    }
}
