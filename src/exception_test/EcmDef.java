package exception_test;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/23:35
 * @Description:
 */
public class EcmDef {
    public static void main(String[] args) {
        int result = 0;
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);

            result = ecm(i, j);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }

    }
    public static int ecm(int i, int j) throws EcDef {
        if (i < 0 || j < 0){
            throw new EcDef("分子或分母为负数");
        }
        return i / j;
    }
}
