package Method;

public class ChildClass {
    public String name; //인스턴스 변수
    public String gender; //인스턴스 변수
    public int age; //인스턴스 변수

    public ChildClass(){ //생성자는 반환형이 없음
        System.out.println("--ChildClass--");

    }

    public void getInfo() { //메서드선언 - 접근자 반환형 매서드이름 매개변수 - 소문자로 시작해서 대문자를 붙인다 - 동사를 앞에 뒤에 명사
        //메서드 정의
        System.out.println("--getInfo()--");
        System.out.println("name ="+ name);
        System.out.println("gender ="+ gender);
        System.out.println("age ="+ age);
    }

    public void setInfo(String n, String g, int a){ //n,g,a 는 지역변수 - 인스턴스 메서드
        System.out.println("--setInfo()--");
        name = n;
        gender = g;
        age = a;
    }
    private void mySecret(){
        System.out.println("--mySecret--");
    }
}