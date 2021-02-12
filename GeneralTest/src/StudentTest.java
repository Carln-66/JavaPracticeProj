public class StudentTest {
    public static void main(String[] args) {
        Student[] s1 = new Student[20];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Student();      //给数组元素赋值

            //给student对象属性赋值
            s1[i].number = (i + 1);
            s1[i].state = (int) (Math.random() * (6 + 1 - 1) + 1);   //返回指定范围的随机数(m-n之间)的公式：Math.random()*(n+1-m)+m
            s1[i].score = (int) (Math.random() * (100 + 1));
        }

        Student s2 = new Student();
        s2.print(s1);

        System.out.println("/***************************************************/");

        s2.searchState(s1, 3);

        System.out.println("/***************************************************/");

        s2.sort(s1);

    }
}

class Student {

    int number;
    int state;
    int score;

    public String info() {
        return "学号：" + number + ", 年级：" + state + ", 成绩：" + score;
    }

    /**
     * 遍历数组
     *
     * @param stus
     */
    public void print(Student[] stus) {
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }

    /**
     * 按年级搜索
     *
     * @param s1
     * @param state
     */
    public void searchState(Student[] s1, int state) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].state == 3) {
                System.out.println(s1[i].info());
            }
            continue;
        }
    }

    /**
     * 按成绩排序打印数组（冒泡排序）
     *
     * @param stus
     */
    public void sort(Student[] stus) {
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].score > stus[j + 1].score) {
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].info());
        }
    }
}


