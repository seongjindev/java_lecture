package AbstractBank;

public class BankMain {
    public static void main(String[] args){
        AbstractBankExtends ae = new AbstractBankExtends("hong",10000);
        ae.deposit(10000);
        ae.moneyInfo();
        ae.withdraw(5000);
        ae.moneyInfo();

    }
}
