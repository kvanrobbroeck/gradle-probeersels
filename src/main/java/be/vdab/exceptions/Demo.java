package be.vdab.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        try {
            int getal = geefPositiefGetal();
            System.out.println(getal);
        }catch (NotPositiveNumberException e) {
            System.out.println("SOMETHING IS WRONG. WHAT COULD IT BE? " + e.getMessage());
        }
    }

    private static int geefPositiefGetal() {
        System.out.println("Geef getal:");
        int result;
        try(Scanner s = new Scanner(System.in)) {
            result = s.nextInt();
            if(result < 0) {
                throw new NotPositiveNumberException("Blab ablabla");
            }
        } catch (InputMismatchException e) {
            System.out.println("FOUTE INVOER");
            result = 0;
        }
        return result;
    }

}
