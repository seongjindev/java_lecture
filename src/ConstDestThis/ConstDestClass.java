package ConstDestThis;

public class ConstDestClass {

    public int x; //인스턴스 변수, 전역변수
    public int y; //인스턴스 변수, 전역변수

    public ConstDestClass() { //생성자, 생성자는 반환형이 필요없다, 생성자를 만들지 않아도 컴파일 시점에 자동으로 생성된다
        System.out.println("--ConstDestClass--");
    }
    public ConstDestClass(String s, int[] arr){
        System.out.println(s);
        System.out.println(arr);
    }
    public ConstDestClass(int x,int y){ //여기의 x,y는 지역 변수
        this.x = x;
        this.y = y;
    }
    public void getInfo(){
        System.out.println("x = "+ this.x);
        System.out.println("y = "+ this.y);
    }
}
