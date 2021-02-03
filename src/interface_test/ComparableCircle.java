package interface_test;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/13:14
 * @Description:
 */
public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof ComparableCircle) {
            ComparableCircle c = (ComparableCircle) o;
            //以下方法会精度损失
//            return (int)(this.getRadius() - c.getRadius());
            if (this.getRadius() > c.getRadius()) {
                return 1;
            } else if (this.getRadius() < c.getRadius()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            throw new RuntimeException("传入的数据不匹配");
        }
    }
}
