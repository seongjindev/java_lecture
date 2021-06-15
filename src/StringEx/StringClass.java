package StringEx;

import java.io.InputStreamReader;

public class StringClass {
    public static void main(String[] args){
        String a = "JAVA"; //클래스이지만 그냥 써도 된다
        String b = new String(); //new를 써도 된다
        StringBuilder sb = new StringBuilder();
        StringBuffer sf = new StringBuffer();


        a = "JAVA";
        a += "PROGRAM";//기존 객체를 버리로 새로운 객체에 생성한다

        sb.append("JAVA");
        System.out.println(sb);
        sb.append("sb");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.insert(1,"1010");
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);

        sf.append("JAVA");
        System.out.println(sf);
        sf.append("sf");
        System.out.println(sf);

        InputStreamReader isr = new InputStreamReader(System.in);
        

    }
}
