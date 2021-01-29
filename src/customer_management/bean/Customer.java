package customer_management.bean;

/**
 * @Auther: Carl
 * @Date: 2021/01/29/20:32
 * @Description:
 */

public class Customer {

    private String name;
    private char gender;
    private int age;
    private String contactNum;
    private String email;


    public Customer(){

    }

    public Customer(String name, char gender, int age, String contactNum, String email){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contactNum = contactNum;
        this.email = email;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}