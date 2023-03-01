package n2exercici1.Factories;

import n2exercici1.App.Tools;
import n2exercici1.Countries.*;

import static n2exercici1.App.Tools.getString;

public class EuropeFactory extends AbstractFactory {

    //omplir constructor

    @Override
    public Contact getContact(String country) {

        switch (country.toLowerCase()){
            case "spain" -> {
                super.contact = new Spain(Tools.getString("\nContact Name?"),
                        Tools.getString("Contact surname?"),
                        Tools.getString("Home Address?"),
                        Tools.getString("Zip Code?"),
                        Tools.getString("Phone Number?"));
                //adding created object to contactBookList array.
                AbstractFactory.contactBookList.add(super.contact);
                return super.contact;
            }
            case "germany" -> {
                super.contact = new Germany(Tools.getString("\nContact Name?"),
                        Tools.getString("Contact surname?"),
                        Tools.getString("Home Address?"),
                        Tools.getString("Zip Code?"),
                        Tools.getString("Phone Number?"));
                AbstractFactory.contactBookList.add(super.contact);
                return super.contact;
            }
            default -> {
                return null;
            }
        }
    }
}
