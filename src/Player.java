/**
 * @Auther: Carl
 * @Date: 2021/02/06/10:43
 * @Description: 创建一个球员类，并且该类最多只允许创建十一个对象。
 */
public class Player {
    private static int sum;     //当前总人数

    public Player(){
        System.out.println("创建一个新球员");
    }

    public static Player creatPlayer(){
        Player player = null;
        if (sum >= 11) {
            System.out.println("球队已满");
        }else {
            player = new Player();
            sum++;
        }
        return player;
    }

    public static void main(String[] args) {
        Player[] player = new Player[11];
        for (int i = 0;; i++) {
            Player p = Player.creatPlayer();
            if (p == null){
                break;
            }else {
                player[i] = p;
            }
        }
    }
}
