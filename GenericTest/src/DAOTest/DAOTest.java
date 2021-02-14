package DAOTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Carl
 * @Date: 2021/02/14/15:57
 * @Description:
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<User>();

        dao.save("1000", new User(1001, 19, "张三"));
        dao.save("1001", new User(1002, 15, "李四"));
        dao.save("1002", new User(1003, 25, "王五"));

        dao.update("1002", new User(1003, 33, "赵六"));

        dao.delete("1000");

        List<User> list = dao.list();
//        System.out.println(list);
        list.forEach(System.out::println);
    }
}
