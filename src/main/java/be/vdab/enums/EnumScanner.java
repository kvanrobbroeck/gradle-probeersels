package be.vdab.enums;

import java.util.Scanner;

public class EnumScanner {
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);
            String in = s.next();
            Season season = Season.valueOf(in);
        } catch (IllegalArgumentException e) {
            System.out.println("FOUTE INVOER");
        }
    }

    public static Season valueOf(String in) {
        Season season = null;
        switch (in) {
            case "WINTER":
                season = Season.WINTER;
                break;
            case "SPRING":
                season = Season.SPRING;
                break;
            case "SUMMER":
                season = Season.SUMMER;
                break;
            case "FALL":
                season = Season.FALL;
                break;
            default:
                throw new IllegalArgumentException("Not an enum instance");
        }
        return season;
    }
}
