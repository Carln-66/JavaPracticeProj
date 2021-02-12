package GeometricObject;

/**
 * @Auther: Carl
 * @Date: 2021/01/31/13:33
 * @Description:
 */
public class GeometricObject {

    protected String color;
    double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
