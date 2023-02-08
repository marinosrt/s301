package n2exercici1.App;

import n2exercici1.Factories.AbstractFactory;

public class ContactBook {

    //variable to keep track if there's some contacts inside the ContactBook
    static private int contactsAdded = 0;
    static private AbstractFactory abstractFactory;

    public static void addContact(){
        contactsAdded++;
        String country;

        country = Tools.getString("\nWhat country does your contact live in? \nAvailable countries: Spain, Germany, Nepal, China, Morocco and Egypt");

        //Send chosen country to FactoryProducer parameter to create European/Asian/MiddleEast Factory or return null if not chosen a correct country
        abstractFactory = FactoryProducer.getFactory(country);

        if (abstractFactory == null) {
            System.out.println("\nYou can only create contacts from the following countries: Spain, Germany, Nepal, China, Morocco and Egypt");
        } else {
            //create Factory according to selected country
            abstractFactory.getContact(country);
            System.out.println("\nContact created!");
        }

    }

    public static void deleteContact(){
        int size = AbstractFactory.contactBookList.size();
        int sizeAfter;

        if (contactsAdded > 0){
            AbstractFactory.contactBookList.removeIf(str -> str.getName().equalsIgnoreCase(Tools.getString("Enter the name and surname you want to delete")));
            sizeAfter = AbstractFactory.contactBookList.size();
            //checking if there was an object removed from the list
            if (size == sizeAfter){
                System.out.println("\nNo contact was found with this name and surname.");
            } else {
                System.out.println("\nContact deleted!");
                contactsAdded--;
            }
        } else {
            System.out.println("\nFirst you need to add some contacts!");
        }

    }

    public static void searchContact(){
        if (contactsAdded > 0){
            AbstractFactory.contactBookList.stream()
                    .filter(str -> str.getName().equalsIgnoreCase(Tools.getString("What's the name and surname of the contact you want to display?")))
                    .findFirst()
                    .ifPresent(System.out::println);
        } else {
            System.out.println("First you need to add some contacts!");
        }
    }

    public static void displayContactBook(){
        if (contactsAdded > 0){
            System.out.println("Contact Book: ");
            AbstractFactory.contactBookList.forEach(System.out::println);
        } else {
            System.out.println("Fist you need to add some contacts!");
        }
    }

}
