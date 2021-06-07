package SpecialCharacters;

public class SpecialCharactersEx {
    public static void main(String[] args){
        System.out.println("hello\tworld");
        System.out.println("hello\nworld");
        System.out.println("hello\'world\'");
        System.out.println("hello\"world\"");
        System.out.println("hello\\world");
        //주석
        /*주석*/
        System.out.printf("오늘 온도는 %d 입니다\n",20);
        System.out.printf("오늘 온도는 %o 입니다\n",20);
        System.out.printf("오늘 온도는 %x 입니다\n",20);

        System.out.printf("문자 출력 %c\n",'A');
        System.out.printf("문자열 출력 %s\n","안녕하세요");
        System.out.printf("실수 출력 %f\n",3.1415);

        System.out.printf("오늘 온도는 %d 입니다\n",123);
        System.out.printf("오늘 온도는 %d 입니다\n",1234);
        System.out.printf("오늘 온도는 %d 입니다\n",12345);
        System.out.printf("오늘 온도는 %5d 입니다\n",123);
        System.out.printf("오늘 온도는 %5d 입니다\n",1234);
        System.out.printf("오늘 온도는 %5d 입니다\n",12345);

        System.out.printf("실수 출력 %.1f\n",3.1415);
        System.out.printf("실수 출력 %.2f\n",3.1415);

    }
}
