package InterfaceExToy;

public class ToyCar implements Toy{

    public ToyCar() {
        System.out.println("--ToyCar--");
    }

    @Override
    public void run() {
        System.out.println("--Car run--");
    }

    @Override
    public void stop() {
        System.out.println("--Car stop--");
    }

    @Override
    public void light() {
        System.out.println("--Car light--");
    }
}
