package be.vdab.beehive;

public class FlowersMain {
    public static void main(String[] args) {
        Worker maja = new Worker("Maya", 0, 100);
        Flower daisy = new Flower(10, "white", "Daisy");
        if(!maja.gatherNectar(daisy)) {
            Flower violet = new Flower(7, "violet", "Violet");
            maja.gatherNectar(violet);
        }
        System.out.println(maja.getLoad() + "/" + maja.getCapacity());
    }


}
