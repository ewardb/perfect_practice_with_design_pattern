package chain_of_responsibility;

/**
 * Created by wangqiang26 on 2017/8/19.
 */
public abstract class Handler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handler(String opr, double handPrice);
}
