package account_custom_opti;

public class BankTest {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new Account(2000);

        bank.addCustomer("Jane", "Smith");

        bank.getCustomer(0).setAccount(account);

        double balance = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("客户 " + bank.getCustomer(0).getFirstName() +"的账户余额为：" + balance);

    }


}
