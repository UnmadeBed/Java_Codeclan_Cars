import Vehicles.VehicleProperties;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double totalMoney;
    private ArrayList<VehicleProperties> vehicles;

    public Customer(String name, double money){
        this.totalMoney = totalMoney;
        this.vehicles = new ArrayList<VehicleProperties>;

    }

    public String getName() {
        return name;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public int getVehicles() {
        return vehicles.size();
    }
}
