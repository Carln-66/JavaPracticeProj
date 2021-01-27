public class yangTriangle {

    public static void main(String[] args) {

        //声明并初始化二维数组
        int[][] yangTriangle = new int[10][];

        //给数组元素赋值
        for (int i = 0; i < yangTriangle.length; i++) {
            yangTriangle[i] = new int[i + 1];

            //给首尾元素赋值
            yangTriangle[i][0] = yangTriangle[i][i] = 1;

            //给每行的非首尾元素赋值
            if (i > 1) {
                for (int j = 1; j < yangTriangle[i].length - 1; j++) {
                    yangTriangle[i][j] = yangTriangle[i - 1][j - 1] + yangTriangle[i - 1][j];
                }
            }
        }

        //遍历数组
        for (int i = 0; i < yangTriangle.length; i++) {
            for (int j = 0; j < yangTriangle[i].length; j++) {
                System.out.print(yangTriangle[i][j] + "  ");
            }
            System.out.println();

        }
    }
}
