/**
 * @Auther: Carl
 * @Date: 2021/03/22/23:24
 * @Description: 逆波兰表达式计算
 * 3 4 + 5 * 6 -
 */
public class test {


}

class Singleton {
    private volatile static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}




