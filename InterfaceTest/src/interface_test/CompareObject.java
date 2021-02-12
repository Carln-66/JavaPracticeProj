package interface_test;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/13:10
 * @Description:
 */
public interface CompareObject {
    //若返回值是0，代表相等；若为正数，代表当前对象大，负数代表当前对象小
    public int compareTo(Object o);

}
