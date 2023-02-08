package n2exercici1.Countries;

public class Egypt extends ContactInfo {

    public Egypt(String name, String surname, String homeAdress, String zipCode, String phoneNumber) {
        super(name, surname, homeAdress, zipCode, phoneNumber);
    }

    @Override
    public String toString() {
         return name + " " + surname + ". " +
                "Adress: " + homeAddress + ", " + zipCode + ", Egypt. " +
                "Phone Number: 00-20-" + phoneNumber;
    }
}
