package org.example;

class Flight_finder {
    public static void main(String[] args) {
        Flight oneFlight = new Flight("Orlando", "Krakow");
        System.out.println(oneFlight.departure + " " + oneFlight.arrival);
        oneFlight.displayDestinationAndArrival();
       // oneFlight.isDivided(4, 18);
       // oneFlight.getEvenSum(5, 12);
        oneFlight.getNUmber(5, -2);
    }
}


class Flight {
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public void displayDestinationAndArrival() {
        System.out.println("Flight from " + this.departure + " to " + this.arrival);
    }
    public void isDivided(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i%3 == 0 || i%5 == 0 ){
                System.out.println(i);
            }
        }
    }
    public void getEvenSum(int first, int second) {
        int sum = 0;
        for (int i = first; i <= second; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public void getNUmber(int first, int second) {
        if ( first > second) {
            for (int i = first; i >= second; i--) {
                System.out.println(i);
            }
        }else {
            for (int i = second; i >= first; i--) {
                System.out.println(i);
            }
        }
    }
}
