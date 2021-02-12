package Vehicle;

/**
 * @Auther: Carl
 * @Date: 2021/02/06/11:26
 * @Description: 设计2个类，要求如下：
 * 2.1 定义一个汽车类Vehicle，
 * 2.1.1 属性包括：汽车品牌brand（String类型）、颜色color（String类型）和速度speed（double类型）。
 * 2.1.2 至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为0）。
 * 2.1.3 为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
 * 2.1.4 定义一个一般方法run()，用打印语句描述汽车奔跑的功能
 * 2.1.5 在main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
 * 2.2 定义一个Vehicle类的子类轿车类Car，要求如下：
 * 2.2.1 轿车有自己的属性载人数loader（int 类型）。
 * 2.2.2 提供该类初始化属性的构造方法。
 * 2.2.3 重新定义run()，用打印语句描述轿车奔跑的功能。
 * 2.2.4 在main方法中创建一个品牌为“Honda”、颜色为“red”，载人数为2人的轿车。
 */
public class Vehicle {
    private String brand;
    private String carColor;
    private double speed = 0.0;

    public Vehicle() {
    }

    public Vehicle(String brand, String carColor) {
        this.brand = brand;
        this.carColor = carColor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("交通工具在行驶");
    }

    @Override
    public String toString(){
        return "品牌：" + getBrand() + " 颜色：" + getCarColor() + " 速度：" + getSpeed();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Benz", "black");

        Vehicle car = new Car("Honda", "red", 2);

        System.out.println(vehicle.toString());
        System.out.println(car.toString());

    }
}
