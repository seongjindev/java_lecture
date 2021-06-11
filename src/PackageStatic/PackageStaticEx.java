package PackageStatic;

import java.util.ArrayList;
import ConstDestThis.*; //다른 패키지를 사용하기 위해서는 import를 해야한다, *를 사용하면 해당 패키지 안에있는 모든 클래스 사용가능
import Method.ChildClass;

class StaticEx {
    int a; //인스턴스 변수
    int b;
    static int c; //클래스 변수, 모든 객체에 공유됨
    static int d;

    public void sum1(int n) { //인스턴스 메서드
        System.out.println("인스턴스 메서드");
        c += n; //인스턴스 메소드는 클래스 멤버에 접근 할 수 있다
        sum2(); //인스턴스 메소드는 클래스 멤버에 접근 할 수 있다
        System.out.println(c);
    }
    public static void sum2() { //클래스 메서드
        System.out.println("클래스 메서드");
        //this.a = 10; //클래스 메소드는 인스턴스 멤버에 접근할 수 없다
        //sum1(1) //클래스 메소드는 인스턴스 멤버에 접근할 수 없다
    }

}

public class PackageStaticEx {
    public static void main(String[] args){
        ArrayList<String> arr = new ArrayList<>();
        ChildClass chi = new ChildClass();
        ObjectMemory.ObjectClass oc = new ObjectMemory.ObjectClass(); //패키지의 이름을 넣으면 import하지 않아도 된다, 쓰지않는 방법임

        StaticEx.sum2();//클래스 메서드는 선언하지 않아도 사용가능

        StaticEx se = new StaticEx();
        se.sum1(10);

        StaticEx se2 = new StaticEx();
        se2.sum1(100);

    }
}
