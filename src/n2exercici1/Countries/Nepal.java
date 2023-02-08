package n2exercici1.Countries;

public class Nepal extends ContactInfo {


    public Nepal(String name, String surname, String homeAddress, String zipCode, String phoneNumber) {
        super(name, surname, homeAddress, zipCode, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ". " +
                "Adress: " + homeAddress + ", " + zipCode + ", Nepal. " +
                "Phone Number: 00-977-" + phoneNumber;
    }
}
