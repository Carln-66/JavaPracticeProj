package singleton;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Auther: Carl
 * @Date: 2021/02/02/13:53
 * @Description:单例模式(懒汉式)
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Test test1 = Test.getInstance();
        Test test2 = Test.getInstance();

        System.out.println(test1 == test2);
    }
}

class Test{
    //1.私有化类的构造器
    private Test(){

    }
    //2.先声明当前类的一个对象
    //4.此对象也必须声明为static的
    private static Test instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static Test getInstance(){
        if (instance == null){
            instance = new Test();
        }
        return instance;

    }

}