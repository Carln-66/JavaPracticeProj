package customer_management.service;

import customer_management.bean.Customer;

/**
 * @Auther: Carl
 * @Date: 2021/01/29/20:34
 * @Description:
 */


public class CustomerList {

    private Customer[] customers;
    private int total;

    /**
     * @Description: 数组初始化
     * @Param: [maxNum]
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 20:47
     */
    public CustomerList(int maxNum){
        customers = new Customer[maxNum];
    }

    /**
     * @Description: 增加用户信息
     * @Param: [customer]
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 20:47
     */
    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    /**
     * @Description: 修改用户信息
     * @Param: []
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 20:47
     */
    public boolean modifiedCustomer(int index, Customer customer){
        if (index < 0 || index >= total){
            return false;
        }
        customers[index] = customer;
        return true;
    }

    /**
     * @Description: 删除用户信息
     * @Param: [index]
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 21:07
     */
    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total - 1; i++){
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * @Description: 列举全部用户信息
     * @Param: []
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 21:07
     */
    public Customer[] getAllCustomers(){
        Customer[] cust = new Customer[total];      //将所有信息赋到一个长度为total的数组中去
        for (int i = 0; i < total; i++){
            cust[i] = customers[i];
        }
        return cust;
    }

    /**
     * @Description: 获取指定索引位置的客户信息
     * @Param: [index]
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 21:19
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * @Description: 返回全部用户数量
     * @Param: []
     * @return:
     * @Author: Carl
     * @Date: 2021/1/29 21:07
     */
    public int getTotal(){
        return total;
    }
}