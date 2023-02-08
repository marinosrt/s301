package n2exercici1.App;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        int input;

        do {

            System.out.println("""
                    0. Exit
                    1. Add contact.
                    2. Delete contact.
                    3. Search for a contact.
                    4. Display all Contact Book.""");
            input = Tools.getInt("Choose and option.");

            switch (input){
                case 0 -> System.out.println("Bye!");
                case 1 -> ContactBook.addContact();
                case 2 -> ContactBook.deleteContact();
                case 3 -> ContactBook.searchContact();
                case 4 -> ContactBook.displayContactBook();
            }

        } while(input != 0);

    }

}
