package n2exercici1.Factories;

import n2exercici1.Countries.Contact;
import n2exercici1.Countries.ContactInfo;

import java.util.Set;
import java.util.TreeSet;

import static n2exercici1.App.Tools.getString;

public abstract class AbstractFactory {

    public static Set<ContactInfo> contactBookList = new TreeSet<>(new ObjectComparator());
    public static ContactInfo contact;

    public abstract Contact getContact(String str);

}
