package TreeSetTest;

import org.junit.Test;

import java.util.TreeSet;

/**
 * @Auther: Carl
 * @Date: 2021/02/12/15:36
 * @Description:
 */
public class EmployeeTest {

    //使用自然排序
    @Test
    public void test1(){
        TreeSet treeSet = new TreeSet();

        Employee employee1 = new Employee("张三", 16, new MyDate(1999, 12, 15));
        Employee employee2 = new Employee("李四", 20, new MyDate(1989, 4, 26));
        Employee employee3 = new Employee("王五", 5, new MyDate(1989, 2, 27));
        Employee employee4 = new Employee("赵六", 52, new MyDate(2002, 7, 12));
        Employee employee5 = new Employee("周七", 34, new MyDate(1995, 6, 4));

        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);

    }
}
