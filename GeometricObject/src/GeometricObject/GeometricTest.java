package GeometricObject;

/**
 * @Auther: Carl
 * @Date: 2021/01/31/13:43
 * @Description:
 */
public class GeometricTest {

    public static void main(String[] args) {

        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("Red", 10, 10);
        test.displayGeometricObject(c1);
        MyRectangle m1 = new MyRectangle("White", 10, 3.2, 4.3);
        test.displayGeometricObject(m1);

        boolean isEquals = test.equalArea(c1, m1);
        System.out.println("两图形面积大小是否相等：" + isEquals);
    }

    public boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.findArea() == object2.findArea();
    }

    public void displayGeometricObject(GeometricObject object){
        System.out.println("面积为" + object.findArea());
    }


}
