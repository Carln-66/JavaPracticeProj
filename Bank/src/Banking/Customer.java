package Banking;

/**
 * @Auther: Carl
 * @Date: 2021/03/19/17:42
 * @Description:
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l){
        this.firstName = f;
        this.lastName = l;
        System.out.println("Creating the customer "+ firstName + " " + lastName +".");
    }

    public String  getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount(){
        return account;
    }
}
