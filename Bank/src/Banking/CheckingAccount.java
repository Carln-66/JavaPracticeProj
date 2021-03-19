package Banking;

/**
 * @Auther: Carl
 * @Date: 2021/03/19/18:27
 * @Description:
 */
public class CheckingAccount extends Account{
    private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect){
        super(balance);
        overdraftProtection = protect;
    }

    @Override
    public boolean withdraw(double amt){
        if (amt <= balance) {
            balance -= amt;
            return true;
        } else {
            double v = amt - balance;
            if (v <= overdraftProtection) {
                overdraftProtection -= v;
                balance = 0;
                return true;
            } else {
                System.out.println("可透支余额不足");
                return false;
            }
        }
    }
}
