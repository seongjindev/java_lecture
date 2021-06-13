package AbstractClass;

public abstract class AbstractClassEx {
    int num;
    String str;

    public AbstractClassEx() { //추상클래스는 생성자를 가질 수 있다
        System.out.println("AbstractClassEx");
    }
    public AbstractClassEx(int a, int b){
        System.out.println("AbstractClassEx int a int b");
    }
    public void sum(){ //추상클래스는 메서드를 가질 수 있다
        System.out.println("sum");
    }
    public abstract void total(); //상속받는곳에서 반드시 구현해야한다
}
