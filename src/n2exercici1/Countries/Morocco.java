package n2exercici1.Countries;

public class Morocco extends ContactInfo {

    public Morocco(String name, String surname, String homeAdress, String zipCode, String phoneNumber) {
        super(name, surname, homeAdress, zipCode, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ". " +
                "Address: " + homeAddress + ", " + zipCode + ", Morocco. " +
                "Phone Number: 00-212-" + phoneNumber;
    }
}
