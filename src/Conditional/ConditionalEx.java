package Conditional;

import java.util.Scanner;

public class ConditionalEx {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        if(a>b){
            System.out.println("a>b");
        }else if(a==b){
            System.out.println("a==b");
        }else{
            System.out.println("a<b");
        }
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch(c){
            case 100:
            case 90:
                System.out.println("고득점");
                break;
            case 70:
                System.out.println("노력하세요");
                break;
            default:
                System.out.println("힘내자");
                break;
        }
        sc.close();
    }
}
