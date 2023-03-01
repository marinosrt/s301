package n3exercici1.Bridge;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void arrencar(){
        System.out.println("El " + name + " està arrancant.");
    }

    public void accelerar(){
        System.out.println("El " + name + " està accelerant.");
    }

    public void frenar(){
        System.out.println("El " + name + " està frenant.");
    }
}
