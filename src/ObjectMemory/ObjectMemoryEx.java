package ObjectMemory;

public class ObjectMemoryEx {
    public static void main(String[] args){
        ObjectClass obj1 = new ObjectClass();
        ObjectClass obj2 = new ObjectClass();
        ObjectClass obj3 = new ObjectClass();

        System.out.println("obj1 = "+ obj1);
        System.out.println("obj2 = "+ obj2);
        System.out.println("obj3 = "+ obj3);

        obj1.getInfo();

        obj1 = null; //레퍼런스가 끊김

        obj1.getInfo();
    }
}
