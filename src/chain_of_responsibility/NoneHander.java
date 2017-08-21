package chain_of_responsibility;

/**
 * Created by wangqiang26 on 2017/8/19.
 */
public class NoneHander extends Handler {


    @Override
    public void handler(String opr, double handPrice) {
        if(handPrice < 0 || null == opr){
            return ;
        }else{
            if(null != getHandler()){
                getHandler().handler(opr,handPrice);
            }
        }
    }
}
