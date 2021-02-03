/**
 * @Auther: Carl
 * @Date: 2021/02/03/12:13
 * @Description: 代理模式(Proxy)
 */
public class NetworkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxySever proxySever = new ProxySever(server);

        proxySever.browse();
    }
}

interface Network {
    public void browse();
}

//被代理类
class Server implements Network {
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}

class ProxySever implements Network {

    private Network work;

    public ProxySever(Network work) {
        this.work = work;
    }

    public void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();
    }
}
