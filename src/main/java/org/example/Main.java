package org.example;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 700);
        System.out.println(phone.weight + " " + phone.price);
        MobilePhone oldPhone = new MobilePhone("4000g", 100);
        System.out.println(oldPhone.weight);

        MobilePhone mediumPhone = new MobilePhone("600g", 300);
        System.out.println(mediumPhone.weight + " " + mediumPhone.price);
        oldPhone.displayValues();
        String parameters = mediumPhone.getParameters();
        System.out.println(parameters);
        mediumPhone.displayPrice();
        mediumPhone.loverPrice();
        mediumPhone.raisePrice();
        phone.checkPrice();
        mediumPhone.checkPrice();
        oldPhone.checkPrice();

    }
}
class MobilePhone {
    String weight;
    int price;
    public MobilePhone(String weight, int price){
        this.weight = weight;
        this.price = price;
    }
    public void displayValues (){
        System.out.println(this.weight + " " + this.price);
    }
    public String getParameters(){
        return this.weight + " " + this.price;
    }
    public void displayPrice () {System.out.println((this.price));}
    public  void loverPrice () {System.out.println((this.price * 0.90));}
    public void raisePrice () {
        int amount = 300;
        System.out.println(this.price + amount);}
    public void checkPrice() {
        if (this.price < 200) {
            System.out.println("Price is very good");
        } else if (this.price < 300 ) {
            System.out.println("Price is good");
        } else if (this.price <550) {
            System.out.println("Price could be lower");
        } else {
            System.out.println("This phone is too expensive");
        }
    }
    }
