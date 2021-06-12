package InterfaceExToy;

public class ToyTrain implements Toy {
    public ToyTrain() {
        System.out.println("ToyTrain");
    }

    @Override
    public void run() {
        System.out.println("Train run");
    }

    @Override
    public void stop() {
        System.out.println("Train stop");
    }

    @Override
    public void light() {
        System.out.println("Train light");
    }
}
