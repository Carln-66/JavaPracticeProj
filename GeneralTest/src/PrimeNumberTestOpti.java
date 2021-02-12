public class PrimeNumberTestOpti {
    long end = System.currentTimeMillis();

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        label:
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {        //优化二，减少运算次数
                if (i % j == 0) {
                    continue label;
                }
            }
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: "+(end -start));  //Time=60
    }
}

