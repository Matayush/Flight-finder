package org.example;
class Flight {
    String departure;
    String arrival;
    int price;

    public Flight(String departure, String arrival, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public String displayDestinationAndArrival() {
        return "Flight from " + this.departure + " to " + this.arrival + " and it costs " + this.price + "$.";
    }
}
