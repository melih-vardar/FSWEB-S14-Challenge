package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.1, "Double Sandwich");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public DeluxeBurger(String name, String meat, String breadRollType) {
        super(name, meat, 19.10, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Name: " + getName());

        System.out.println("Meat: " + getMeat());

        System.out.println("BreadRollType: " + getBreadRollType());

        System.out.println("Price: "+getPrice());

    }
}
