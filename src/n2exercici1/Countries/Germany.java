package n2exercici1.Countries;

public class Germany extends ContactInfo {

    private final String country = "Germany";

    public Germany(String name, String surname, String homeAdress, String zipCode, String phoneNumber) {
        super(name, surname, homeAdress, zipCode, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ". " +
                "Adress: " + homeAddress + ", " + zipCode + ", " + country + ". " +
                "Phone Number: 00-49-" + phoneNumber;
    }
}
