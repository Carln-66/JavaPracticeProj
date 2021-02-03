package exception_test;

/**
 * @Auther: Carl
 * @Date: 2021/02/03/23:51
 * @Description:
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -3387516124229948L;

    public EcDef(){

    }

    public EcDef(String msg){
        super(msg);
    }

}
