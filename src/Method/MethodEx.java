package Method;

public class MethodEx {

    public static void main(String[] args){
        ChildClass cc1 = new ChildClass(); //cc1는 주소를 가르킨다 cc1는 레퍼런스
        cc1.setInfo("hong","M",20);
        cc1.getInfo();
        //cc1.mySecret(); private는 호출불가


    }
}
