package Lamda;

public class LamdaEx {
    public static void main(String[] args){
        //매개변수와 실행문만으로 작성한다.(접근자, 반환형, retrun 키워드 생략)
        LamdaInterface1 li1 = (String s1, String s2, String s3) -> {
            System.out.println(s1 +" "+s2 +" "+s3);
        };
        li1.method("Hello","world","java");

        //타입이 같을 때, 타입을 생략할 수 있다
        LamdaInterface1 li11 = (s1, s2, s3) -> { System.out.println(s1 +" "+s2 +" "+s3); };

        //매개변수가 1개이거나 타입이 같을 때, 타입을 생략할 수 있다
        LamdaInterface2 li2 = (s1) -> { System.out.println(s1); };

        // 실행문이 1개일 때, {}를 생략할 수 있다
        LamdaInterface2 li3 = (s1) -> System.out.println(s1);//<-실행문이 한개임

        // 매개변수와 실행문이 1개일 때, ()와 {}를 생략할 수 있다
        LamdaInterface2 li4 = s1 -> System.out.println(s1);

        //매개변수가 없을 때 ()만 작성한다
        LamdaInterface3 li5 = () -> System.out.println("none");

        //반환값이 있는 경우
        LamdaInterface4 li6 = (a,b) -> {//<-타입이 같을 때, 타입을 생략할 수 있다
            int result = a+b;
            return result;
        };

        li6 = (x,y) -> {
            int result = x*y;
            return result;
        };
    }
}
