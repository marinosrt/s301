package n2exercici1.App;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {

    static Scanner sc = new Scanner(System.in);

    public static int getInt(String message){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        boolean correct = false;

        do{
            System.out.println(message);
            try {
                input = sc.nextInt();
                correct = true;
            } catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer.");
            }
            sc.nextLine();
        } while(!correct);
        return input;
    }

    public static String getString(String message) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean correct = false;

        do {
            System.out.print(message);
            try {
                input = sc.nextLine();
                correct = true;
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please, enter an input using only characters.");
            }
            sc.nextLine();
        } while (!correct);
        return input;
    }



}
