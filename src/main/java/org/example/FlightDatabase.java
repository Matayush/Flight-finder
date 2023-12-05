package org.example;

import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokio"));
        this.flights.add(new Flight("Paris", "Berlin"));
        this.flights.add(new Flight("Warsaw", "Paris"));
        this.flights.add(new Flight("Madrid", "Berlin"));
        this.flights.add(new Flight("Berlin", "Warsaw"));
        this.flights.add(new Flight("Paris", "Madrid"));
        this.flights.add(new Flight("Porto", "Warsaw"));
        this.flights.add(new Flight("Madrid", "Porto"));
        this.flights.add(new Flight("Warsaw", "Madrid"));
    }

    public void checkIfFlightExists(String start, String end) {
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (start.equalsIgnoreCase(flight.departure) && end.equalsIgnoreCase(flight.arrival)) {
                System.out.println("Flight exists!!!");
                return;
            }
        }
        System.out.println("Flight with given params not exist");
    }

    public ArrayList<Flight> getFlightsFromCity(String city) {
        ArrayList<Flight> results = new ArrayList<>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equalsIgnoreCase(flight.departure)) {
                results.add(flight);
            }
        }
        return results;
    }
    public ArrayList<Flight> getFlightsToCity(String city) {
        ArrayList<Flight> results = new ArrayList<>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (city.equalsIgnoreCase(flight.arrival)) {
                results.add(flight);
            }
        }
        return results;
    }
    public void displayFlights(ArrayList<Flight> results) {
        if (results.isEmpty()) {
            System.out.println("Flight not found");
        }
        for (int i = 0; i < results.size(); i++) {
            Flight flight = results.get(i);
            System.out.println(flight.displayDestinationAndArrival());
        }
    }
    public void displayFlightsFromCity(String city) {
        ArrayList<Flight> results = getFlightsFromCity(city);
        displayFlights(results);
    }
    public void displayFlightsToCity(String city) {
        ArrayList<Flight> results = getFlightsToCity(city);
        displayFlights(results);
    }
    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (int i = 0; i < this.flights.size(); i++) {
            Flight flight = this.flights.get(i);
            if (!cities.contains(flight.departure)) {
                cities.add(flight.departure);
            }
            if (!cities.contains(flight.arrival)) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }

}
