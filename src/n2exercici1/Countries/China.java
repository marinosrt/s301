package n2exercici1.Countries;

public class China extends ContactInfo {

    public China(String name, String surname, String homeAdress, String zipCode, String phoneNumber) {
        super(name, surname, homeAdress, zipCode, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ". " +
                "Adress: " + homeAddress + ", " + zipCode + ", China. " +
                "Phone Number: 00-86-" + phoneNumber;
    }
}
