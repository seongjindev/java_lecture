package AbstractBank;

public abstract class AbstractBank {
    private String name;
    int totalAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractBank(String name, int totalAmount) {
        this.name = name;
        this.totalAmount = totalAmount;
    }
    //예금
    public abstract void deposit(int a);
    //출금
    public abstract void withdraw(int a);
    //정보확인
    public void moneyInfo(){
        System.out.println("name = "+ getName());
        System.out.println("amount = "+ this.totalAmount);
    }
}
