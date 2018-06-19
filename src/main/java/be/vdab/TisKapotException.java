package be.vdab;

public class TisKapotException extends Exception {
    private String wrom;

    public TisKapotException(String message, String wrom) {
        super(message);
    }

    public String getWrom() {
        return wrom;
    }
}
