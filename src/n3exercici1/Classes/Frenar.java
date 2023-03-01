package n3exercici1.Classes;

import n3exercici1.Bridge.Vehicle;

public class Frenar implements Order{

    private Vehicle vehicle;

    public Frenar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.frenar();
    }
}
