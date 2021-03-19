package Banking;

/**
 * @Auther: Carl
 * @Date: 2021/03/19/17:15
 * @Description:
 */
public class Account {
    protected double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
        System.out.println("Creating an account with a "+ init_balance + " balance");
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance += amt;
//        System.out.println("Deposit " + amt);
        return true;
    }

    public boolean withdraw(double amt){
        if (amt > balance){
//            System.out.println("余额不足");
            return false;
        }
        balance -= amt;
//        System.out.println("Withdraw " + amt);
        return true;
    }
}
