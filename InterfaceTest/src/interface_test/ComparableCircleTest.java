package interface_test;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/13:31
 * @Description:
 */
public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(0.8);
        ComparableCircle c2 = new ComparableCircle(1.2);

        Circle c3 = new Circle(0.5);

        int result = c1.compareTo(c3);
        System.out.println(result);
    }
}
