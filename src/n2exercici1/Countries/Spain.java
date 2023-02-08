package n2exercici1.Countries;

public class Spain extends ContactInfo {


    public Spain(String name, String surname, String homeAdress, String zipCode, String phoneNumber) {
        super(name, surname, homeAdress, zipCode, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " " + surname + ". " +
                "Adress: " + homeAddress + ", " + zipCode + ", Spain. " +
                "Phone Number: 00-34-" + phoneNumber;
    }
}
