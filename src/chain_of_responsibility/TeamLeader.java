package chain_of_responsibility;

/**
 * Created by wangqiang26 on 2017/8/19.
 */
public class TeamLeader extends Handler {
    /**
     * caadfafaffdafdfdf
     * @param opr  afafderereqr
     * @param handPrice  qrergfr
     */
    @Override
    public void handler(String opr, double handPrice) {
        if(handPrice < 500){
            System.out.println(this.getClass().getName() +"    " + opr+"处理执行 ");
        }else{
            if(null != getHandler()){
                getHandler().handler(opr,handPrice);
            }
        }
    }
}
