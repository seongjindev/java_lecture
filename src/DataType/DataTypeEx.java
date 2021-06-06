package DataType;

public class DataTypeEx {
    public static void main(String[] args){
        char c = 'a';
        System.out.println("c=" + c);

        int i = 10;
        System.out.println("i=" + i);

        double d = 10.256;
        System.out.println("d=" + d);

        boolean b = false;
        System.out.println("b=" + b);

        String s = "Hello World";
        System.out.println("s=" + s);

        //자동 형변환 프로모션
        byte by = 100;
        int in = by;
        System.out.println("in "+in);

        int inOne = 100;
        byte bOne = (byte)inOne;
        System.out.println("bd "+bOne);

        int intwo = 100000;
        byte btwo = (byte)intwo;
        System.out.println("btwo "+btwo);
    }
}
