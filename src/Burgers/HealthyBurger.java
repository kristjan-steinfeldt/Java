package Burgers;

public class HealthyBurger extends Hamburger{
    private static final String Name ="Healthy" ;
    private static final String BreadRollType = "Brown rye roll";
    String healthyExtra1Name;
   double healthyExtra1Price;
   String healthyExtra2Name;
   double healthyExtra2Price;


//Two methods, addHealthyAddition1 and addHealthyAddition2 should be created that each accept a name and price for the addition, allowing for up to two(2) addons to the basic healthy burger.
// And finally the itemizeHamburger method created in the Hamburger class should be overridden to generate a message appropriate to the type of burger along with any addons.
// The method also returns the total price of the healthy burger of type double.
    public HealthyBurger(String Meat, double Price) {
        super(Name, Meat, Price, BreadRollType);
    }
    public void addHealthyAddition1(String name, double price){
        System.out.println("Added "+name+" for an extra "+price);
    this.healthyExtra1Name=name;
    this.healthyExtra1Price=price;
    this.price+=healthyExtra1Price;
    }
    public void addHealthyAddition2(String name, double price){
        System.out.println("Added "+name+" for an extra "+price);
        this.healthyExtra2Name=name;
        this.healthyExtra2Price=price;
        this.price+=healthyExtra2Price;
    }
}
