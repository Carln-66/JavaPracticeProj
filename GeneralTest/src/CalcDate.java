import java.time.DayOfWeek;
import java.time.LocalDate;

//程序功能：当前日期用*标记，计算某月份天数以及一个给定日期响应是星期几
public class CalcDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();       //初始化当前日期

        int month = date.getMonthValue();       //获取当前月份天数
        int today = date.getDayOfMonth();       //获取当天日期数值

        date = date.minusDays(today - 1);       //用minusDays方法，用当前天数减（当前天数-1）赋予date，
                                                //将date设置为月初第一天
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();         //1 = Monday, . . . ,7 = Sunday

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");      //打印日历星期
        for (int i = 1; i < value; i++)
            System.out.print("    ");           //通过循环，若获取的星期对应的数字小于i则不断i++，直至i<value
                                                //得到对应位置的日期

        while (date.getMonthValue() == month)       //加入判断条件，判断是否为当前月
        {
            System.out.printf("%3d", date.getDayOfMonth());     //循环打印日期对应的天数，占3个字符，不足补齐
            if (date.getDayOfMonth() == today)
                System.out.print("*");                          //判断条件：如果日期等于今天，则在日期后打印*
            else
                System.out.print(" ");                          //判断条件，如果日期不等于今天则打印“ ”
            date = date.plusDays(1);                            //plusDays生成日期后1天
            if (date.getDayOfWeek().getValue() == 1)            //判断条件，如果date向后循环利用getDayOfWeek方法获得的星期
                System.out.println();                           //几的值等于星期一对应的1，则换行输出到下一周
        }
        if (date.getDayOfWeek().getValue() != 1)                //
            System.out.println();
    }
}