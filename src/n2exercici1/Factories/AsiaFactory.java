package n2exercici1.Factories;

import n2exercici1.App.Tools;
import n2exercici1.Countries.*;
import static n2exercici1.App.Tools.getString;

public class AsiaFactory extends AbstractFactory {

    @Override
    public Contact getContact(String country) {

        switch (country.toLowerCase()){
            case "nepal" -> {
                super.contact = new Nepal(Tools.getString("\nContact Name?"),
                        Tools.getString("Contact surname?"),
                        Tools.getString("Home Address?"),
                        Tools.getString("Zip Code?"),
                        Tools.getString("Phone Number?"));
                //adding created object to contactBookList array.
                AbstractFactory.contactBookList.add(super.contact);
                return super.contact;
            }
            case "china" -> {
                super.contact = new China(Tools.getString("\nContact Name?"),
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
