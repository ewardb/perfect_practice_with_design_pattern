package proxy.jdkProxyLearn;

import proxy.TestService;
import proxy.TestServiceImpl;

/**
 * @author wangqiang26
 * @mail wangqiang26@jd.com
 * @Date 18:40 2018/10/15
 */
public class Test {


    public static void main(String[] args) throws Exception {

        TestService testService = new TestServiceImpl();
        TestService proxy = (TestService) new JdkInvocationHandler().getInstance(testService);
        proxy.testIng();

        // 这里我们将jdk生成的代理类输出了出来，方便后面分析使用
//        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy4444", new Class[]{testService.getClass()});
//
//        FileOutputStream os = new FileOutputStream("Proxy4444.class");
//        os.write(bytes);
//        os.close();

    }


}
