package Burgers;



public class DeluxeBurger extends Hamburger{
    private static final String Name = "Deluxe";
    private static final String Meat = "Sausage & Bacon";
    private static final double Price = 14.54;
    private static final String BreadRollType = "White roll";
    public DeluxeBurger() {
        super(Name, Meat, Price, BreadRollType);
        System.out.println("Added Chips for an extra 2.75");
        System.out.println("Added Drink for an extra 1.81");
        this.price+=2.75+1.81;
    }
    //For the second class, DeluxeBurger, there are no additional member variables, and the constructor accepts no parameters.
    // Instead, the constructor creates a deluxe burger with all the fixings and chips and a drink for a base price of $19.10.
    // The constructor can be configured in any way, as long as chips and drink are added for the total price just mentioned.
    // In this class, the four(4) methods defined in the Hamburger class for including additional toppings must each be overridden
    // so that a message is printed stating that no additional items can be added to a deluxe burger.

}
