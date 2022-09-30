package Burgers;

public class Hamburger {
    String name;
    String meat;
    double price;
    String breadRollType;
    String addition1Name;
    double addition1Price;
    String addition2Name;
    double addition2Price;
    String addition3Name;
    double addition3Price;
    String addition4Name;
    double addition4Price;
    public Hamburger(String Name, String Meat,double Price, String BreadRollType){
        this.name=Name;
        this.meat=Meat;
        this.price=Price;
        this.breadRollType=BreadRollType;
        System.out.println(Name+" hamburger on a "+BreadRollType+" with "+Meat+", price is "+Price);

    }
    void addHamburgerAddition1(String ingredient, double price){
        System.out.println("Added "+ingredient+" for an extra "+ price);
        this.addition1Name=ingredient;
        this.addition1Price=price;
    }
    private void addHamburgerAddition2(String ingredient,double price){
        System.out.println("Added "+ingredient+" for an extra "+ price);
        this.addition2Name=ingredient;
        this.addition2Price=price;
    }
    void addHamburgerAddition3(String ingredient, double price){
        System.out.println("Added "+ingredient+" for an extra "+ price);
        this.addition3Name=ingredient;
        this.addition3Price=price;
    }
    void addHamburgerAddition4(String ingredient, double price){
        if (this.name=="Deluxe"){
            System.out.println("Cannot not add additional items to a deluxe burger");
        }
        else {
            System.out.println("Added "+ingredient+" for an extra "+ price);
            this.addition4Name=ingredient;
            this.addition4Price=price;
        }

    }
    String itemizeHamburger(){
    return this.price+addition1Price+addition2Price+addition3Price+addition4Price+"";
    }

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition4("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());

    }


}
