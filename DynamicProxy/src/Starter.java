/**
 * @Auther: Carl
 * @Date: 2021/05/31/17:38
 * @Description:
 */
public class Starter {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) ProxyFactory.getProxy(new SmsServiceImpl());
        smsService.sendMsg("Hello World");
    }
}
