package customer_management.service;

import customer_management.bean.Customer;

public class CustomerList {

    private final Customer[] customers;
    private int total;

    /**
     * @Description: 初始化customers数组
     * @Param: [totalCustomer]
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 12:57
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];

    }

    /**
     * @Description: 添加客户
     * @Param: [customer]
     * @return: boolean; true: 添加成功; false: 添加失败
     * @Author: Carl
     * @Date: 2021/1/29 12:58
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    /**
     * @Description: 替换客户
     * @Param: [index, cust]
     * @return: boolean; true: 替换成功; false: 替换失败
     * @Author: Carl
     * @Date: 2021/1/29 13:01
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @Description: 删除用户信息
     * @Param: [index]
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 14:55
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total + 1] = null;
        total--;
        return true;
    }

    /**
     * @Description: 获取所有用户信息的数组
     * @Param: []
     * @return: 数组
     * @Author: Carl
     * @Date: 2021/1/29 13:07
     */
    public Customer[] getAllCustomers() {
        Customer[] cust = new Customer[total];
        for (int i = 0; i < cust.length; i++) {
            cust[i] = customers[i];
        }
        return cust;
    }

    /**
     * @Description: 获取指定索引位置的用户信息
     * @Param: [index]
     * @return: 数组
     * @Author: Carl
     * @Date: 2021/1/29 13:10
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * @Description: 获取当前用户数量
     * @Param: []
     * @return: int
     * @Author: Carl
     * @Date: 2021/1/29 13:11
     */
    public int getTotal() {
        return total;
    }

}
