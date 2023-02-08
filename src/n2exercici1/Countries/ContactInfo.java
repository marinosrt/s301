package n2exercici1.Countries;

public class ContactInfo implements Contact {

    protected String name;
    protected String surname;
    protected String homeAddress;
    protected String zipCode;
    protected String phoneNumber;

    public ContactInfo(String name, String surname, String homeAddress, String zipCode, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.homeAddress = homeAddress;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String getAddrress() {
        return homeAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
