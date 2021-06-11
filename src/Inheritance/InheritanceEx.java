package Inheritance;

class ParentClass{
    public ParentClass() {
        System.out.println("--ParentClass--");
    }
    public void parentStart(){
        System.out.println("--parentStart--");
    }
    private void parentPrivate() {
        System.out.println("--parentPrivate--");
    }

}

class ChildClass extends ParentClass {
    public ChildClass(){
        System.out.println("--ChildClass--");
    }
    public void childStart(){
        System.out.println("--childStart--");
    }
}
class CChildClass extends ChildClass {
    public CChildClass() {
        System.out.println("--CChildClass--");
    }
    public void CChildStart() {
        System.out.println("--CChildStart--");
    }
}

public class InheritanceEx {
    public static void main(String[] args){
        CChildClass cc = new CChildClass(); //부모클래스의 생성자가 먼저 실행된다
        cc.parentStart();
        cc.childStart();
        cc.CChildStart();
        //cc.parentPrivate(); //private은 상속에서 제외된다

        ParentClass pc = new ParentClass();


    }
}
