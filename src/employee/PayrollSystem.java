package employee;

import java.util.Scanner;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/10:15
 * @Description:
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入当月月份：");
        int month = input.nextInt();

        Employee[] employee = new Employee[2];
        employee[0] = new SalariedEmployee("张三", 100,
                new MyDate(1995, 12, 16), 7000);
        employee[1] = new HourlyEmployee("李四", 5000, new MyDate(1997, 3, 2), 52.5, 200);

        for (int i = 0; i < employee.length; i++){
            System.out.println(employee[i]);
            double salary = employee[i].earnings();
//            System.out.println("月工资为：" + salary);

            if (month == employee[i].getBirthday().getMonth()){
                salary += 100;
            }
            System.out.println("月工资为：" + salary);
        }
    }
}
