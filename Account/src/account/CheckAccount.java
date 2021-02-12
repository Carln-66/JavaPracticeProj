package account;

/**
 * @Auther: Carl
 * @Date: 2021/01/30/21:57
 * @Description:
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount){
        if (amount <= getBalance()){
            super.withdraw(amount);
            return;
        }else if (overdraft <= amount - getBalance()){
            System.out.println("可透支余额不足");
            return;
        }
        overdraft = overdraft - amount + getBalance();
        setBalance(0.0);
    }

    public double getOverdraft() {
        return overdraft;
    }
}
