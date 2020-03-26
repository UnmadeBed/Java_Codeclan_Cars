package Vehicles;

import Components.*;

public class Car extends VehicleProperties{

    private String model;

    public Car(String model, double price, String colour, Doors doors, Engine engine, Seats seats, Wheels wheels, WindscreenWipers windscreenWipers) {
        super(price, colour, doors, engine, seats, wheels, windscreenWipers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
