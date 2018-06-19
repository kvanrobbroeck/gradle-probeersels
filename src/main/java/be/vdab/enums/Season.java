package be.vdab.enums;

public enum Season {
    WINTER(100),
    SPRING(70),
    SUMMER(40),
    FALL(80);

    public int rainfall;

    Season(int rainfall) {
        this.rainfall = rainfall;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }
}
