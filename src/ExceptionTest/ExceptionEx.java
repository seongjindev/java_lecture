package ExceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int r = 0;
        Scanner sc = new Scanner(System.in);

        //r= i/j;

        try{
            r = i/j;
        } catch(Exception e){
            e.printStackTrace(); //어떤 오류가 발생했는지 콘솔창 보여줌
            String msg =e.getMessage(); //간략하게 나타낸 문자를 받음
            System.out.println("Exception : "+ msg);
        }
        System.out.println("fin");

        try{
            System.out.println("input i : ");
            i = sc.nextInt();
            System.out.println("input j : ");
            j = sc.nextInt();
            System.out.println("i/j = "+(i/j));

            //try 안에서 위에서 에러가 나면 아래 실행문은 실행되지 않는다

            int[] box = {1,2,3};
            System.out.println(box[5]);

        }catch(InputMismatchException e){ //따로 구분해서 잡을 수 있다
            e.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally { //반드시 실행한다
            System.out.println("must!");
            sc.close();
        }

        System.out.println("fin");

        ExceptionEx ee = new ExceptionEx();

        try{
            ee.first();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("fin ee");


    }
    public void first() throws Exception{
        second();
    }
    public void second() throws Exception{
        third();
    }
    public void third() throws Exception{ //나를 호출한 곳으로 예외를 던진다
        System.out.println("10/0"+(10/0));
    }
}
