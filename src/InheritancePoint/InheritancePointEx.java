package InheritancePoint;

class ParClass extends Object { //Object클래스는 최상위 클래스이다
    int year = 2010;
    public void makeComputer(){
        System.out.println("--Par makeComputer--");
    }
    private void parPri(){
        System.out.println("--parPri--");
    }
}
class FirstChiClass extends ParClass {
    int year = 2020;
    @Override
    public void makeComputer() {
        System.out.println("--First makeComputer--");
    }
    private void ChiPri(){
        System.out.println("--ChiPri--");
    }
    public void showYear(){
        System.out.println("FirstChi year = " + this.year);
        System.out.println("Par year = " + super.year);
    }
}
class SecondChiClass extends ParClass {
    @Override
    public void makeComputer() {
        System.out.println("--Second makeComputer--");
    }
}
class CChiClass extends FirstChiClass {
    int year = 2030;
    @Override
    public void makeComputer() {
        super.makeComputer();
    }

    @Override
    public void showYear(){
        System.out.println("this.year = "+this.year);
        System.out.println("super.year = "+super.year);

    }
}

public class InheritancePointEx {
    public static void main(String[] args){
        FirstChiClass cc = new FirstChiClass();
        cc.makeComputer();
        cc.showYear();
        //cc.ChiPri(); //private 때문에 사용이 불가능하다

        ParClass pc1 = new FirstChiClass();//부모클래스로 만들수도 있음

        ParClass[] pc2 = new ParClass[2]; //기본 자료형처럼 클래스도 자료형이다
        pc2[0] = new FirstChiClass();
        pc2[1] = new SecondChiClass();

        for(int i = 0;i<pc2.length;i++){
            pc2[i].makeComputer();
        }

    }
}
