package com.example.week01_1.person;

public class BusExample{
    public static void main(String[] args) {
        Bus bus = new Bus();
        Bus bus2 = new Bus();

        bus.state();
        System.out.println("------------------------------------------");
        bus.ride(2);
        System.out.println("------------------------------------------");
        bus.drive();
        System.out.println("------------------------------------------");
        bus.ride(45);
        System.out.println("------------------------------------------");
        bus.ride(5);
        System.out.println("------------------------------------------");
        bus.drive2();


    }
}
