package n3exercici1.Classes;

import n3exercici1.Bridge.Vehicle;

public class Accelerar implements Order{

    private Vehicle vehicle;

    public Accelerar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.accelerar();
    }
}
