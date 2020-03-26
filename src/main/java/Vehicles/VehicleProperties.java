package Vehicles;

import Components.*;

public abstract class VehicleProperties {

    private double price;
    private String colour;
    private Doors doors;
    private Engine engine;
    private Seats seats;
    private Wheels wheels;
    private WindscreenWipers windscreenWipers;

    public VehicleProperties(double price, String colour, Doors doors, Engine engine, Seats seats, Wheels wheels, WindscreenWipers windscreenWipers) {
        this.price = price;
        this. colour = colour;
        this.doors = doors;
        this.engine = engine;
        this.seats = seats;
        this.wheels = wheels;
        this.windscreenWipers = windscreenWipers;
    }

    //Getters
    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Doors getDoors() {
        return doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public Seats getSeats() {
        return seats;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public WindscreenWipers getWindscreenWipers() {
        return windscreenWipers;
    }
}
