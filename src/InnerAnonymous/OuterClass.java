package InnerAnonymous;

public class OuterClass {
    int a; //인스턴스 변수
    static int b; //클래스 변수

    public OuterClass() {
        System.out.println("--OuterClass--");
    }

    class InnerClass {
        public InnerClass() {
            int b = a; //인스턴스 변수에 접근할 수 있다
            System.out.println("--InnerClass--");
        }
    }
    static class StaticInnerClass {
        //int c = a; //static 클래스는 외부 클래스 멤버에 접근할 수 없다
        int d = b; //클래스 변수는 접근할 수 있음
        public StaticInnerClass() {
            System.out.println("--StaticInnerClass--");
        }
    }
}
