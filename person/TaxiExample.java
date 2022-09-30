package com.example.week01_1.person;

public class TaxiExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Taxi taxi2 = new Taxi();

        taxi.state();

        taxi.ride(3, "서울역", 3);
        System.out.println("------------------------------------------");
        taxi.drive();
        System.out.println("------------------------------------------");
        taxi.pay();
        System.out.println("------------------------------------------");
        taxi.ride(5, "강남역", 4);
        System.out.println("------------------------------------------");
        taxi.ride(3, "구로디지털단지", 12);
        System.out.println("------------------------------------------");
        taxi.drive2();
    }
}
