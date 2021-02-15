package wordcount;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: Carl
 * @Date: 2021/02/15/20:28
 * @Description: 获取文本上字符出现的次数, 把数据写入文件
 */
public class WordCount {
    @Test
    public void test1() {
        BufferedWriter bw = null;
        FileReader fr = null;
        try {
            Map<Character, Integer> map = new HashMap<>();
            File file = new File("dbcp.txt");
            fr = new FileReader(file);

            int len;
            while ((len = fr.read()) != -1) {
                char ch = (char) len;
                if (map.get(ch) == null) {
                    map.put(ch, 1);
                } else {
                    map.put(ch, map.get(ch) + 1);
                }
            }

            bw = new BufferedWriter(new FileWriter(new File("count.txt")));
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();
            while (iterator.hasNext()) {
                Map.Entry<Character, Integer> next = iterator.next();
                switch (next.getKey()) {
                    case ' ':
                        bw.write("空格：" + next.getValue());
                    case '\t':
                        bw.write("tab键：" + next.getValue());
                    case '\r':
                        bw.write("回车：" + next.getValue());
                    case '\n':
                        bw.write("换行：" + next.getValue());
                    default:
                        bw.write(next.getKey() + "：" + next.getValue());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
