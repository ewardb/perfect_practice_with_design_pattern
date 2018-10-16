package proxy.myproxy;

import proxy.TestService;
import proxy.TestServiceImpl;

/**
 * @author wangqiang26
 * @mail wangqiang26@jd.com
 * @Date 10:20 2018/10/16
 */
public class Test {
    public static void main(String[] args) {
        //jdk 与cglib 的写法都差不多！


        TestService testService = new TestServiceImpl();
        TestService proxy = (TestService) new CustomInvocationHandler().getInstance(testService);
        proxy.testIng();
    }
}
