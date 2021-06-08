package OOP;

public class OPPEx {
    public static void main(String[] args){
        Car sonata = new Car(1);
        sonata.color = "red";
        sonata.price = 100;

        Car k5 = new Car();
        k5.color = "green";
        k5.price = 200;

        // Car객체 <-- sonata주소(레퍼런스), Car객체 <-- k5주소(레퍼런스)

        sonata.info();
        k5.info();

        Bicycle bi = new Bicycle("kakao");
        bi.color ="black";
        bi.price =100;
        bi.info();
        System.out.println(bi.name);

        /*Bicycle bi2 = new Bicycle("naver");
        bi2.color ="green";
        bi2.price =200;
        bi2.info();

        bi.info();*/

    }

}
