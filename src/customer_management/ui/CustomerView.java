package customer_management.ui;

import customer_management.bean.Customer;
import customer_management.service.CustomerList;
import customer_management.util.CMUtility;

/**
 * @Auther: Carl
 * @Date: 2021/01/29/21:23
 * @Description:
 */

    public class CustomerView {

        private final CustomerList customers = new CustomerList(10);

        public CustomerView() {
            Customer cust = new Customer("贺梓毓", '男', 30, "010-56253825",
                    "abc@email.com");
            customers.addCustomer(cust);
        }

        public static void main(String[] args) {
            CustomerView view = new CustomerView();
            view.enterMainMenu();
        }

        public void enterMainMenu() {

            boolean isFlag = true;

            while (isFlag) {

                System.out.println("\n-----------------客户信息管理系统-----------------\n");
                System.out.println("                   1 添 加 客 户");
                System.out.println("                   2 修 改 客 户");
                System.out.println("                   3 删 除 客 户");
                System.out.println("                   4 客 户 列 表");
                System.out.println("                   5  退     出\n");
                System.out.print("                   请选择(1-5)：");

                switch (CMUtility.readMenuSelection()) {
                    case '1':
                        addNewCustomer();
                        break;
                    case '2':
                        modifyCustomer();
                        break;
                    case '3':
                        deleteCustomer();
                        break;
                    case '4':
                        listAllCustomers();
                        break;
                    case '5':
                        System.out.print("确认退出？(Y / N)\t");
                        char YN = CMUtility.readConfirmSelection();
                        if (YN == 'Y') {
                            isFlag = false;
                        }
                }
            }
        }

        private void addNewCustomer() {
            System.out.println("---------------------添加客户---------------------");
            if (customers.getTotal() >= 10) {
                System.out.println("----------------记录已满,无法添加-----------------");
            } else {
                System.out.print("姓名：");
                String name = CMUtility.readString(4);
                System.out.print("性别：");
                char gender = CMUtility.readChar();
                System.out.print("年龄：");
                int age = CMUtility.readInt(2);
                System.out.print("电话：");
                String phone = CMUtility.readString(13);
                System.out.print("邮箱：");
                String email = CMUtility.readString(20);

                //将上述数据封装到对象中
                Customer cust = new Customer(name, gender, age, phone, email);
                customers.addCustomer(cust);

                System.out.println("---------------------添加完成---------------------");

            }

        }

        private void modifyCustomer() {

            Customer cust;
            int num;
            for (; ; ) {
                System.out.println("---------------------修改客户---------------------");
                System.out.print("输入要修改的用户编号(输入-1退出)：");
                num = CMUtility.readInt();
                if (num == -1) {
                    return;
                }
                cust = customers.getCustomer(num - 1);
                if (cust == null) {
                    System.out.println("无法获取指定编号的用户");
                } else {
                    break;      //结束循环
                }
            }

            //修改用户信息
            System.out.print("姓名(" + cust.getName() + ")：  ");
            String name = CMUtility.readString(4, cust.getName());
            System.out.print("性别(" + cust.getGender() + ")：  ");
            char gender = CMUtility.readChar(cust.getGender());
            System.out.print("年龄(" + cust.getAge() + ")：  ");
            int age = CMUtility.readInt(cust.getAge());
            System.out.print("电话(" + cust.getContactNum() + ")：  ");
            String phone = CMUtility.readString(13, cust.getContactNum());
            System.out.print("邮箱(" + cust.getEmail() + ")：  ");
            String email = CMUtility.readString(20, cust.getEmail());

            Customer customer = new Customer(name, gender, age, phone, email);

            customers.modifiedCustomer(num - 1, customer);

            System.out.println("---------------------修改完成---------------------");
        }

        private void deleteCustomer() {
            int index;
            for (; ; ) {
                System.out.println("输入删除用户的编号(-1退出)：");
                index = CMUtility.readInt();
                if (index == -1) {
                    return;
                }
                Customer cust = customers.getCustomer(index - 1);
                if (cust == null) {
                    System.out.println("无法获取指定编号的用户");
                    continue;
                } else {
                    break;
                }
            }
            System.out.println("确认删除？(Y / N)");
            char check = CMUtility.readConfirmSelection();
            if (check == 'Y') {
                customers.deleteCustomer(index - 1);
                System.out.println("---------------------删除完成---------------------");
            } else {
                return;
            }
        }

        private void listAllCustomers() {
//        System.out.println("列举用户");
            System.out.println("---------------------------客户列表---------------------------");
            Customer[] custs = customers.getAllCustomers();
            if (custs.length == 0) {
                System.out.println("没有用户信息");
                System.out.println("-------------------------客户列表完成-------------------------");
            } else {
                System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱\t\t\t");
                for (int i = 0; i < custs.length; i++) {
                    System.out.println(i + 1 + "\t\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t\t"
                            + custs[i].getAge() + "\t\t" + custs[i].getContactNum() + "\t" + custs[i].getEmail() + "\t\t\t");
                }
                System.out.println("-------------------------客户列表完成-------------------------");
            }
        }
    }