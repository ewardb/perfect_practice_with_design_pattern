package chain_of_responsibility;

/**
 * Created by wangqiang26 on 2017/8/19.
 */
public class Test {
    public static void main(String[] args){
        Handler noneHander = new NoneHander();
        Handler teamHander = new TeamLeader();
        Handler deptHander = new DeptLeader();
        Handler bossHander = new Boss();

        noneHander.setHandler(teamHander);
        teamHander.setHandler(deptHander);
        deptHander.setHandler(bossHander);

        noneHander.handler("abc",200);
        noneHander.handler("bcd",500);
        noneHander.handler("cde",600);
        noneHander.handler("def",700);
        noneHander.handler("efg",800);
        noneHander.handler("fgh",1200);
        noneHander.handler("gh",200);

    }
}
