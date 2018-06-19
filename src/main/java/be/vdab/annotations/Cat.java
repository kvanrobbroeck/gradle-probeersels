package be.vdab.annotations;

/**
 * Example of custom annotation @Cool (runtime)
 */
@Cool
public class Cat extends Animal {
    private int id;

    private String name;

    private int lives;

    /**
     * Example of built-in annotation @Override (compile-time)
     */
    @Override
    public void sound() {
        System.out.println("Miauw!");
    }
}
