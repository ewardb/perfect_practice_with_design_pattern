package chain_of_responsibility;

/**
 * Created by wangqiang26 on 2017/8/19.
 */
public class Boss extends Handler {
    @Override
    public void handler(String opr, double handPrice) {
        if(handPrice > 1000){
            System.out.println(this.getClass().getName() +"    " +opr+ "处理执行 ");
        }else{
            if(null != getHandler()){
                getHandler().handler(opr,handPrice);
            }else{
                System.out.println("处理不了了。。。 ");
            }
        }
    }
}
