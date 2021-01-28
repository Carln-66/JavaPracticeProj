package AccountCustomer;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customer = new Customer("Jane", "Smith");

        Account acct = new Account(1000, 2000, 0.0123);

        acct.deposit(100.0);
        System.out.println(acct.getBalance());

        acct.withDraw(960.0);
        System.out.println(acct.getBalance());

        acct.withDraw(2000.0);
        System.out.println(acct.getBalance());

        System.out.println("Customer [" + customer.getFirstName() + ", " + customer.getLastName() + "] has a account: " +
                "id is " + acct.getId() + ", annualInterestRate is " + acct.getAnnualInterestRate());

    }



}
