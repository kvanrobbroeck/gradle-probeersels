package be.vdab.enums;

public class EnumDemo {
    public static void main(String[] args) {

        Season[] seasons = Season.values();

        // One way to loop over enums
        for(int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        // Other way to loop over enums
        for (Season season : seasons) {
            System.out.println(season);
        }

    }
}
