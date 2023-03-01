package n3exercici1.Classes;

import n3exercici1.Bridge.Vehicle;

public class Arrencar implements Order{

    private Vehicle vehicle;

    public Arrencar(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        this.vehicle.arrencar();
    }
}
