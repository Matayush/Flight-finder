package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FlightDatabase database = new FlightDatabase();
        database.checkIfFlightExists("Paris", "Madrid");
        database.displayFlightsFromCity("Paris");
        database.displayFlightsToCity("Warsaw");
        ArrayList<String> cities = database.getCities();
        System.out.println(cities);
    }

}
