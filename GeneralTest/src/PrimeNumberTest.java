public class PrimeNumberTest {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        boolean mark = true;    //标识符

        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {        //优化二，减少运算次数
                if (i % j == 0) {
                    mark = false;
                    break;      //优化一
                }
            }
            if (mark == true) {
                System.out.println(i);
            }
            mark = true;        //重置mark值
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
        //无break：13490
        //有break：1145
        //有sqrt(i)：83
    }
}

