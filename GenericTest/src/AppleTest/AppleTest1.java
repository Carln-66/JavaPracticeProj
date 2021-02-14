package AppleTest;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @Auther: Carl
 * @Date: 2021/02/14/15:31
 * @Description:
 */
public class AppleTest1 {

    @Test
    public void test1(){

        ArrayList<Apple> arrayList = new ArrayList<>();

        arrayList.add(new Apple("500"));
        arrayList.add(new Apple(500));
        arrayList.add(new Apple(500.0));

        System.out.println(arrayList);


    }
}
