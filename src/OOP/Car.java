package OOP;

public class Car{ //클래스 이름 : 일반적으로 첫글자는 대문자로 한다

    public String color;//멤버 변수(속성)
    public String gear;
    public int price;

    public Car(){ //생성자 - 외부에서 클래스를 이용해서 객체를 만들 때 가장 먼저 호출 - 생성자를 통해 메모리에 객체가 올라감
        System.out.println("Car");
    }
    public Car(int a){ //생성자는 여러개 만들 수 있음
        System.out.println("Car " + a);
    }
    public void run(){ //메서드
        System.out.println("run!");
    }
    public void stop(){
        System.out.println("stop!");
    }
    public void info(){
        System.out.println("color = "+color);
        System.out.println("price = "+price);
    }

}