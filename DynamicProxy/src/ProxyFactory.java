import java.lang.reflect.Proxy;

/**
 * @Auther: Carl
 * @Date: 2021/05/31/17:22
 * @Description:
 */
public class ProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler(target));
    }
}
