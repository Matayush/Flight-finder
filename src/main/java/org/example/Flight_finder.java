package org.example;

class Flight_finder {
    public static void main(String[] args) {
        Flight oneFlight = new Flight("Orlando", "Krakow");
        System.out.println("Flight from " + oneFlight.departure + " to " + oneFlight.arrival + ".");

    }
}


class Flight{
    String departure;
    String arrival;
    public Flight(String departure, String arrival){
    this.departure = departure;
    this.arrival = arrival;
    }
}
