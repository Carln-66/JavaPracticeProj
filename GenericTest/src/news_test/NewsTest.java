package news_test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Auther: Carl
 * @Date: 2021/02/14/17:08
 * @Description:
 */
public class NewsTest {
    @Test
    public void test1(){
        ArrayList<News> arrayList = new ArrayList<>();
        arrayList.add(new News("标题1", "作者1", "新闻类型1", "新闻内容1"));
        arrayList.add(new News("标题2", "作者2", "新闻类型2", "新闻内容2"));
        arrayList.add(new News("这是一个为了测试才建这么长的标题", "作者3", "新闻类型3", "新闻内容3"));

        Iterator<News> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            News news = iterator.next();
            String cutTitle = news.cutTitle();
            System.out.println(cutTitle);
        }
    }
}
