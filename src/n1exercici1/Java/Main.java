package n1exercici1.Java;

import n1exercici1.Class.Undo;

import static n1exercici1.Tools.Tools.getString;
import static n1exercici1.Tools.Tools.getInt;

public class Main {

    static boolean first = false;

    public static void main(String[] args) {

        menu();

    }

    private static void menu() {
        int klk;

        Undo undo = Undo.getUndo();

        do {
            System.out.println("""
                    What do you want to do?
                    0. Exit programm.
                    1. Add command.
                    2. Delete command.
                    3. Prompt all inserted commands.""");
            klk = getInt("\nChoose an option.");

            switch (klk) {
                case 0 -> System.out.println("Bye!");
                case 1 -> addCommand(undo);
                case 2 -> deleteCommand(undo);
                case 3 -> promptCommands(undo);
            }
        } while (klk != 0);
    }

    private static void addCommand(Undo undo) {
        if (!first){
            first = true;
        }
        undo.addCommand(getString("\nInsert the command"));
    }

    private static void deleteCommand(Undo undo) {
        if (!first){
            System.out.println("\nNo previous commands to delete. Add a command first.\n");
        } else {
            undo.deleteCommand(getString("\nType the command you want to delete"));
        }
    }

    private static void promptCommands(Undo undo) {
        if (!first){
            System.out.println("\nNo previous commands to show. Add a command first.\n");
        } else {
            undo.listAllCommands(getInt("\nHow many commands do you want to see?"));
        }
    }
}