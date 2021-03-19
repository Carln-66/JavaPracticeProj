package Banking;

/**
 * @Auther: Carl
 * @Date: 2021/03/19/18:26
 * @Description:
 */
public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(double balance,double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
