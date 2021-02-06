package Vehicle;

/**
 * @Auther: Carl
 * @Date: 2021/02/06/11:46
 * @Description:
 */
public class Car extends Vehicle{

    private int loader;

    public Car(String brand, String carColor, int loader) {
        super(brand, carColor);
        this.loader = loader;
    }

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    public void run(){
        System.out.println("轿车在行驶");
    }

    public String toString(){
        return "品牌：" + getBrand() + " 颜色：" + getCarColor() + " 速度：" + getSpeed() + " 核载人数：" + getLoader();
    }
}
