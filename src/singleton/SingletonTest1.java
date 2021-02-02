package singleton;

/**
 * @Auther: Carl
 * @Date: 2021/02/02/13:29
 * @Description:单例设计模式(饿汉式)
 *      单例设计模式：所谓类的单类设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例
 *                  的方法。
 *      如何实现：如果我们要让类在一个虚拟机中只能产生一个对象，我们首先必须将类的构造器访问权限设置为private。这样，就不能用new操作符在类的外部
 *              产生类的对象了，但在类的内部仍可以产生该类的对象。因为在类的外部开始还无法获得类的对象，只能通过调用该类的某个静态方法以返回类内
 *              部创建的对象，静态方法只能访问类中的静态成员变量，所以，指向类内部产生的该类的成员变量也必须定义成静态的。
 *      区分饿汉式和懒汉式
 *      饿汉式：缺点：对象加载时间过长
 *              优点：线程安全
 *      懒汉式：优点：延迟对象的创建
 *              目前的写法缺点：线程不安全
 *
 *      单例模式优点：由于单例模式只生成一个实例，减少了系统性能开销，当一个对象的产生需要比较多的资源时，如读取配置、产生其他依赖对象时，则可以通
 *              过再应用启动时直接产生一个单例对象，然后通过永久驻留内存的方式来解决。
 *              举例：java.lang.Runtime
 *      单例模式应用场景： 1. 网站的计数器
 *                      2. 应用程序的日志应用
 *                      3. 数据库连接池
 *                      4. 项目中，读取配置文件的类
 *                      5. Application也是单例的典型应用
 *                      6. Windows的Task Manager(任务管理器)
 *                      7. Windows的Recycle Bin(回收站)
 */
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}

//饿汉式
class Bank{
    //1。私有化类的构造器
    private Bank(){

    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance = new Bank();


    //3.提供公共的静态的方法，返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}
