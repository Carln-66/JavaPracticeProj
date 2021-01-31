package GeometricObject;

/**
 * @Auther: Carl
 * @Date: 2021/01/31/13:35
 * @Description:
 */
public class Circle extends GeometricObject{

    public double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }
}
