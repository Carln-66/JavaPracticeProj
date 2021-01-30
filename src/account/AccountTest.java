package account;

/**
 * @Auther: Carl
 * @Date: 2021/01/30/21:50
 * @Description:
 */
public class AccountTest {

    public static void main(String[] args) {
        CheckAccount account = new CheckAccount(1122, 20000, 0.045, 5000);


        account.withdraw(5000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("您的账户可透支限额为：" + account.getOverdraft());

        account.withdraw(18000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("您的账户可透支限额为：" + account.getOverdraft());
        account.withdraw(3000);
        System.out.println("您的账户余额为：" + account.getBalance());
        System.out.println("您的账户可透支限额为：" + account.getOverdraft());
    }

}
