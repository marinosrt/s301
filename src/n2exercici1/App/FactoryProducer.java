package n2exercici1.App;

import n2exercici1.Factories.*;

import java.util.Set;
import java.util.TreeSet;

public class FactoryProducer {

    public static AbstractFactory getFactory(String country){

        switch (country){
            case "spain", "germany" -> {
                return new EuropeFactory();
            }
            case "China", "Nepal" -> {
                return new AsiaFactory();
            }
            case "morocco", "egypt" -> {
                return new MiddleEastFactory();
            }
            default -> {
                return null;
            }
        }
    }



}
