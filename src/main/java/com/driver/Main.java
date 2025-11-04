package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        Boat boat = new Boat("Titanic",100);
        System.out.println(boat.getVehicleName());
        System.out.println(boat.getVehicleCapacity());
    }
}