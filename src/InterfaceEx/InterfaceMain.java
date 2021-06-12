package InterfaceEx;

public class InterfaceMain {
    public static void main(String[] args){
        InterfaceA ia = new ImplementsClass();
        InterfaceB ib = new ImplementsClass();
        ImplementsClass ic = new ImplementsClass();

        ic.sum(10,20);

    }
}
