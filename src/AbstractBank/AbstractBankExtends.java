package AbstractBank;

public class AbstractBankExtends extends AbstractBank {

    public AbstractBankExtends(String name, int totalAmount) {
        super(name, totalAmount);
    }

    @Override
    public void deposit(int a) {
        totalAmount += a;
        System.out.println("totalAmount = "+ totalAmount);
    }

    @Override
    public void withdraw(int a) {
        totalAmount -= a;
        System.out.println("totalAmount = " + totalAmount);
    }

}
