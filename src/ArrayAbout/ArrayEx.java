package ArrayAbout;

import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args){
        int[] arr1 = new int[2];
        arr1[0] = 1;
        arr1[1] = 2;

        int[] arr2 = {3,4};

        System.out.println(arr1[0]+" "+arr1[1]);
        System.out.println(arr2[0]+" "+arr2[1]);
        System.out.println(Arrays.toString(arr1));

        int[] arr3;
        int[] arr4;

        arr3 = arr1;
        //arr4 = Arrays.copyOf(arr1,arr1.length); //배열 복사 방법
        arr4 = arr1.clone(); //배열 복사 방법
        System.out.println(arr1 +" arr1");
        System.out.println(arr3 +" arr3"); //1번과 같은 주소
        System.out.println(arr4 +" arr4"); //1번과 다른 주소 데이터만 복사

        arr3[0] = 8;
        arr3[1] = 9;
        System.out.println(arr1[0]+" "+arr1[1]); //주소가 같으므로 arr3의 값을 수정하면 arr1도 바뀜
        System.out.println(arr4[0]+" "+arr4[1]);
    }
}
