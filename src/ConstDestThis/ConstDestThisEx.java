package ConstDestThis;

public class ConstDestThisEx {
    public static void main(String[] args){
        ConstDestClass cdc = new ConstDestClass();

        String s = "hello";
        int[] n = new int[2];
        ConstDestClass cdc2 = new ConstDestClass(s,n);

        ConstDestClass cdc3 = new ConstDestClass(10,20);
        cdc3.getInfo();


    }
}
