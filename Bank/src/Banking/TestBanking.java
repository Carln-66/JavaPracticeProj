package Banking;

/**
 * @Auther: Carl
 * @Date: 2021/03/19/17:23
 * @Description:
 */
public class TestBanking {
    public static void main(String[] args) {
//        Account account = new Account(500);
//        account.withdraw(150);
//        account.deposit(22.50);
//        account.withdraw(47.62);
//
//        System.out.println("The account has a balance of " + account.getBalance());

//        Customer customer = new Customer("Jane", "Smith");
//        Account account = new Account(500);
//        customer.setAccount(account);
//        System.out.println("Withdraw 150: " + account.withdraw(150));
//        System.out.println("Deposit 22.50: " + account.deposit(22.50));
//        System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
//        System.out.println("Customer [" + customer.getFirstName() + " " + customer.getLastName() + "] has a balance of " + account.getBalance());

//        Bank bank = new Bank();
//        bank.addCustomer("Simms", "Jane");
//        bank.addCustomer("Carl", "He");
//        bank.addCustomer("MengXi", "Liu");
//
//        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
//            Customer customer = bank.getCustomer(i);
//            System.out.println("Customer [" + (i+1) + "] is " + bank.getCustomer(i).getFirstName() + " " + bank.getCustomer(i).getLastName());
//        }

        CheckingAccount account = new CheckingAccount(200, 100);
        account.withdraw(100);
        System.out.println(account.getBalance());
        account.withdraw(300);
    }
}
