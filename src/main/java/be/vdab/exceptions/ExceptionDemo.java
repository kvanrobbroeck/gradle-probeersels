package be.vdab.exceptions;

import be.vdab.TisKapotException;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int optie = verwerkGetal();
            if (optie == 1) {
                System.out.println("KEUZE AFLSUITEN");
            } else if (optie == 2) {
                System.out.println("KEUZE BESTAND OPENEN");
            } else {
                System.out.println("BESTAND OPSLAAN");
            }
        } catch (TisKapotException e) {
            System.out.println("VERKEERDE KEUZE");
        }

        try {
            int getala = verwerkGetal();
            int getalb = verwerkGetal();
            System.out.println(getala * getalb);
        } catch (TisKapotException e) {
            System.out.println("VERKEED GETAL ALS INPUT VOOR BEREKENING");
        }

    }

    private static int verwerkGetal() throws TisKapotException {
        return vraagGetalAanGebruiker();
    }

    private static int vraagGetalAanGebruiker() throws TisKapotException {

        Scanner s = new Scanner(System.in);
        int getal = s.nextInt();

        if(getal < 0) {
            throw new TisKapotException("Kan geen getal vinden", "Gewoon zomaar");
        }

//        return (int)new DecimalFormat("#,##.00").parse(new Scanner(System.in).next());
        return 0;
    }
}
