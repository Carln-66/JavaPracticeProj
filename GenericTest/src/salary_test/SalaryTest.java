package salary_test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Carl
 * @Date: 2021/02/14/17:34
 * @Description:
 */
public class SalaryTest {
    @Test
    public void test1(){
        Map<String, Integer> m1 = new HashMap<String, Integer>();

        Integer p1 = m1.put("张三", 800);
        Integer p2 = m1.put("李四", 1500);
        Integer p3 = m1.put("王五", 3000);

        m1.replace("张三", 2600);
        Set<Map.Entry<String, Integer>> set = m1.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            next.setValue(100 + next.getValue());
            System.out.println(next);
            System.out.println(next.getValue());
        }


    }
}
