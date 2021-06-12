package InterfaceEx;

public class ImplementsClass implements InterfaceA, InterfaceB {
    public ImplementsClass() {
        System.out.println("--ImplementsClass--");
    }

    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void total(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    @Override
    public int sum2(int a, int b) {
        return a+b;
    }

    @Override
    public int total2(int a, int b, int c) {
        return a+b+c;
    }
}
