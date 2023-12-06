package org.example;

class_method_variable
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        database.checkIfFlightExists("Paris", "Madrid");
        database.displayFlightsFromCity("Paris");
        database.displayFlightsToCity("Warsaw");
        ArrayList<String> cities = database.getCities();
        System.out.println(cities);
        Flight cheapestFlight = database.getCheapestFlight();
        System.out.println("Cheapest flight is " + cheapestFlight.displayDestinationAndArrival());
        ArrayList<Journey> journeys = database.getFlights("Paris", "Porto");
        System.out.println(journeys);

    }


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
main
}
