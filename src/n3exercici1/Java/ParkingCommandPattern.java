package n3exercici1.Java;

import n3exercici1.Bridge.Pilot;
import n3exercici1.Bridge.Vehicle;
import n3exercici1.Classes.Accelerar;
import n3exercici1.Classes.Arrencar;
import n3exercici1.Classes.Frenar;

public class ParkingCommandPattern {

    public static void main(String[] args) {
        Vehicle cotxe = new Vehicle("cotxe");
        Vehicle bicicleta = new Vehicle("bicicleta");
        Vehicle avio = new Vehicle("avio");
        Vehicle vaixell = new Vehicle("vaixell");

        Accelerar accelerar = new Accelerar(avio);
        Arrencar arrencar = new Arrencar(cotxe);
        Arrencar arrencar2 = new Arrencar(vaixell);
        Frenar frenar = new Frenar(bicicleta);

        Pilot pilot = new Pilot();
        pilot.takeOrder(accelerar);
        pilot.takeOrder(arrencar);
        pilot.takeOrder(arrencar2);
        pilot.takeOrder(frenar);

        pilot.placeOrder();
    }

}
