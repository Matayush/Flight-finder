package org.example;

import java.util.ArrayList;

public class FlightDatabase {
    ArrayList<Flight> flights = new ArrayList<>();

    public FlightDatabase() {
        this.flights.add(new Flight("Berlin", "Tokio", 1800));
        this.flights.add(new Flight("Paris", "Berlin", 79));
        this.flights.add(new Flight("Warsaw", "Paris", 120));
        this.flights.add(new Flight("Madrid", "Berlin", 200));
        this.flights.add(new Flight("Berlin", "Warsaw", 77));
        this.flights.add(new Flight("Paris", "Madrid", 180));
        this.flights.add(new Flight("Porto", "Warsaw", 412));
        this.flights.add(new Flight("Madrid", "Porto", 102));
        this.flights.add(new Flight("Warsaw", "Madrid", 380));
    }

    public void checkIfFlightExists(String start, String end) {
        for (Flight flight : this.flights) {
            if (start.equalsIgnoreCase(flight.departure) && end.equalsIgnoreCase(flight.arrival)) {
                System.out.println("Flight exists!!!");
                return;
            }
        }
        System.out.println("Flight with given params not exist");
    }

    public ArrayList<Flight> getFlightsFromCity(String city) {
        ArrayList<Flight> results = new ArrayList<>();
        for (Flight flight : this.flights) {
            if (city.equalsIgnoreCase(flight.departure)) {
                results.add(flight);
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightsToCity(String city) {
        ArrayList<Flight> results = new ArrayList<>();
        for (Flight flight : this.flights) {
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
        for (Flight flight : this.flights) {
            if (!cities.contains(flight.departure)) {
                cities.add(flight.departure);
            }
            if (!cities.contains(flight.arrival)) {
                cities.add(flight.arrival);
            }
        }
        return cities;
    }

    public Flight getCheapestFlight() {
        Flight cheapestFlight = null;
        for (Flight flight : this.flights) {
            if (cheapestFlight == null || flight.price < cheapestFlight.price) {
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
    public Flight getCheapestFlightFromCity(String city) {
        ArrayList<Flight> fromCity = getFlightsFromCity(city);
        Flight cheapestFlight = null;
        for (Flight flight : this.flights) {
            if (cheapestFlight == null || flight.price < cheapestFlight.price) {
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }
    public ArrayList<Journey> getFlights(String start, String end) {
        ArrayList<Flight> starting = getFlightsFromCity(start);
        ArrayList<Flight> ending = getFlightsToCity(end);
        ArrayList<Journey> results = new ArrayList<Journey>();
        for (Flight first : starting) {
            for (Flight second : ending) {
                if (first.arrival.equalsIgnoreCase(second.departure)) {
                    results.add(new Journey(first, second));
                }
            }
        }
        return  results;
    }
}
