package DataPrivate;

class Bank {
    public String name; //인스턴스 변수
    private String name2; //private를 사용해서 외부에서 데이터 변경 불가능
    private int amount; //클래스 변수

    public String getName2() { //private 값을 가져오기 위해 getter 사용
        return name2;
    }

    public void setName2(String name2) { //private 값 설정을 위해 setter 사용
        this.name2 = name2;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if(amount>50){ //안전장치를 할수 있음
            this.amount = amount;
        }
    }

    public Bank(){}

    public Bank(String name){
        this.name = name;
    }
    public Bank(String name2, int amount){
        this.name2 = name2;
        this.amount = amount;
    }
    public void showName(){
        System.out.println(name);
    }
}

public class DataPrivateEx {
    public static void main(String[] args){
        Bank bk = new Bank("kaka");
        bk.showName();
        bk.name = "kakao"; //public으로 만들었기 때문에 변경이 가능하다
        bk.showName();
        System.out.println();

        Bank bk2 = new Bank();
        bk2.setName2("hong");
        System.out.println(bk2.getName2());

        Bank bk3 = new Bank("jin",100);
        bk3.setAmount(10000);
        System.out.println(bk3.getAmount());


    }

}
