/**
 * @Auther: Carl
 * @Date: 2021/05/31/17:15
 * @Description:
 */
public class SmsServiceImpl implements SmsService {
    @Override
    public String sendMsg(String message) {
        System.out.println("send message: " + message);
        return message;
    }
}
