package org.example;

class Flight_finder {
    public static void main(String[] args) {
        Flight oneFlight = new Flight("Orlando", "Krakow");
        System.out.println(oneFlight.departure + " " + oneFlight.arrival);
        oneFlight.displayDestinationAndArrival();
    }
}


class Flight{
    String departure;
    String arrival;
    public Flight(String departure, String arrival){
    this.departure = departure;
    this.arrival = arrival;
    }
    public void displayDestinationAndArrival() {System.out.println("Flight from " + this.departure + " to " + this.arrival);
    }
}
