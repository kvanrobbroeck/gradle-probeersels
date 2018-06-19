package be.vdab.exceptions;

public class TryWithResources {

    public static void main(String[] args) {
        try(MyBucket b = new MyBucket()) {
            System.out.println("XXX");
        } catch (Exception e) {

        }
    }
}

class MyBucket implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("CLOSING MY BUCKET");
    }
}