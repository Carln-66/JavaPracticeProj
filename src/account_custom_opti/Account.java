package account_custom_opti;

public class Account {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    public void withDraw(double amt){
        if (balance >= amt){
            balance -= amt;
            System.out.println("取钱成功");
            return;
        }
        System.out.println("余额不足");
    }





}