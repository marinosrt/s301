package n2exercici1.Factories;

import n2exercici1.Countries.ContactInfo;

import java.util.Comparator;

public class ObjectComparator implements Comparator<ContactInfo> {

    //RETURNS
    // a negative integer, zero, or a positive integer
    // as the first argument
    // is less than, equal to, or greater than the second.


    @Override
    public int compare(ContactInfo o1, ContactInfo o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
