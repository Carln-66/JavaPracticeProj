package pic.java;

import org.junit.Test;

import java.io.*;

/**
 * @Auther: Carl
 * @Date: 2021/02/15/19:51
 * @Description:
 *  图片的加密解密
 */
public class PicTest {
    @Test
    public void test1() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File("头像.jpg")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("加密头像.jpg")));

            byte[] buffer = new byte[128];
            int len = 0;
            while ((len = bis.read(buffer)) != -1){

                //对字节数据进行修改
                //错误，未对buffer中的字节进行修改
    //            for (byte b : buffer){
    //                b = (byte) (b ^ 5);
    //            }

                //正确
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //图片的解密
    @Test
    public void test2() {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(new File("加密头像.jpg")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("解密头像.jpg")));

            byte[] buffer = new byte[128];
            int len = 0;
            while ((len = bis.read(buffer)) != -1){

                //对字节数据进行修改
                //错误，未对buffer中的字节进行修改
                //            for (byte b : buffer){
                //                b = (byte) (b ^ 5);
                //            }

                //正确
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
