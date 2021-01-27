public class PrimeNumberTest {
    public static void main(String[] args) {

        boolean mark = true;

        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    mark = false;
                }
            }
            if (mark == true) {
                System.out.println(i);
            }
            mark = true;
        }
    }
}

