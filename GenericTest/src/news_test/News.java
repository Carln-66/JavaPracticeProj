package news_test;

/**
 * @Auther: Carl
 * @Date: 2021/02/14/16:56
 * @Description: 封装一个新闻类News，包含新闻标题，新闻作者，新闻内容，新闻类型三个属性，提供必要的访问器和修改器方法，重写toString方法，要求打印对象时输出格式为“标题；类型；作者”，要求只要新闻标题相同就判断为同一条新闻。在测试类中创建一个只能容纳该类对象的ArrayList集合，添加三条新闻。遍历集合，打印新闻标题，将新闻标题截取字符串到10个汉字的长度。
 * 按要求完成下列任务
 * 1.	使用HashMap类实例化一个Map类型的对象m1，键（String类型）和值（int型）分别用于存储员工的姓名和工资，存入数据如下：	张三——800元；李四——1500元；王五——3000元；
 * 2.	将张三的工资更改为2600元
 * 3.	为所有员工工资加薪100元；
 * 4.	遍历集合中所有的员工
 * 5.	遍历集合中所有的工资
 */
public class News {
    private String title;
    private String author;
    private String newsType;
    private String content;

    public News() {
    }

    public News(String title, String author, String newsType, String content) {
        this.title = title;
        this.author = author;
        this.newsType = newsType;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return "标题：" + title + "，类型：" + newsType + "，作者：" + author;
    }

    public String cutTitle(){
        if (title.length() >= 10){
            title = title.substring(0, 9);
        }
        return title;
    }
}
