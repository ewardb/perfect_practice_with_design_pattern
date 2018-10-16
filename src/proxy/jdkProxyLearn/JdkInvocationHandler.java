package proxy.jdkProxyLearn;

import proxy.TestService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangqiang26
 * @mail wangqiang26@jd.com
 * @Date 18:37 2018/10/15
 */
public class JdkInvocationHandler implements InvocationHandler {

    private TestService testService;


    public Object getInstance(TestService testService){
        this.testService = testService;
        Class clazz = this.testService.getClass();
        // 参数1：被代理类的类加载器 参数2:被代理类的接口 参数3
        return Proxy.newProxyInstance(clazz.getClassLoader(),
                clazz.getInterfaces(),
                this);
    }




    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy------------------------------");
        return method.invoke(this.testService,args);
    }
}
