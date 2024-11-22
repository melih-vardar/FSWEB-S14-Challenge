package org.example.models;

public class HealthyBurger extends Hamburger {

    String healthyExtra1Name;
    double healthyExtra1Price;
    String healthyExtra2Name;
    double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
     this.healthyExtra1Name = healthyExtra1Name;
     this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double getPrice() {
        double totalPrice= super.getPrice();
        if (this.healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
        }

        return totalPrice;
    }

    @Override
    public void itemizeHamburger() {
        System.out.println("Name: " + getName());

        System.out.println("Meat: " + getMeat());

        System.out.println("BreadRollType: " + getBreadRollType());

        if (this.getAddition1Name() != null) {
            System.out.println("Addition1: " + this.getAddition1Name());
        }
        if (this.getAddition2Name() != null) {
            System.out.println("Addition2: " + this.getAddition2Name());
        }
        if (this.getAddition3Name() != null) {
            System.out.println("Addition3: " + this.getAddition3Name());
        }
        if (this.getAddition4Name() != null) {
            System.out.println("Addition4: " + this.getAddition4Name());
        }

        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: "+this.healthyExtra1Name);
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: "+this.healthyExtra2Name);
        }

        System.out.println("Price: " + getPrice());
    }



}
