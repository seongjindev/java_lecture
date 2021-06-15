package Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsEx {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(1));
        System.out.println(list.size()); //길이 확인
        list.add(0,"A");
        System.out.println(list);
        list.set(0,"B"); //해당 인덱스의 값 변경
        System.out.println(list);
        list.remove(0); //해당 인덱스의 값 삭제
        System.out.println(list);
        System.out.println(list.get(0)); //해당 인덱스값 반환
        list.clear(); //전체 삭제
        System.out.println(list);
        System.out.println(list.isEmpty()); //비어있는지 확인

        HashMap<Integer, String> map = new HashMap<>();
        map.put(5,"Hello");
        map.put(6,"World");
        map.put(7,"JAVA");
        System.out.println(map.size()); //길이 확인
        System.out.println(map);

        map.put(5,"Hi");
        System.out.println(map.get(5)); //해당 키값의 데이터 반환
        System.out.println(map);

        map.remove(7);
        System.out.println(map);

        System.out.println(map.containsKey(7)); //해당 키값의 데이터 유무 판단
        System.out.println(map.containsValue("Hi")); //해당 값이 있는 판단

        map.clear(); //전체데이터 삭제
        System.out.println(map.isEmpty()); //데이터가 있는지 확인

    }
}
