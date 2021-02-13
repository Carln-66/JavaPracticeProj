import org.junit.Test;

import java.util.*;

/**
 * @Auther: Carl
 * @Date: 2021/02/13/21:29
 * @Description:
 */
public class SortInteger {

    @Test
    public void test(){
        Scanner input = new Scanner(System.in);
        ArrayList arrayList  = new ArrayList(10);

        for (int i = 0; i < 10; i++) {
            System.out.println("请输入一个整数");
            int nextInt = input.nextInt();
            arrayList.add(nextInt);
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
