package Banking;

/**
 * @Auther: Carl
 * @Date: 2021/03/19/18:05
 * @Description:
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[8];
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f, l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
    }

    public int getNumberOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }
}
