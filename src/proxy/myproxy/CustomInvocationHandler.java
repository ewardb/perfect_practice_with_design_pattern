package proxy.myproxy;

import proxy.TestService;

import java.lang.reflect.Method;

/**
 * @author wangqiang26
 * @mail wangqiang26@jd.com
 * @Date 10:12 2018/10/16
 */
public class CustomInvocationHandler implements MyInvocationHandler {

    private TestService target;

    public Object getInstance(TestService target){
        this.target = target;
        Class clazz = this.target.getClass();
        // 参数1：被代理类的类加载器 参数2:被代理类的接口 参数3
        // 这里的MyClassLoader先用new的方式保证编译不报错，后面会修改
        return MyProxy.newProxyInstance(new MyClassLoader(),
                clazz.getInterfaces()[0],
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy------------------------------");
        for(int i = 0 ; i<args.length; i ++){
            args[i] = args[i] + "hhhhh";
        }
        return method.invoke(this.target,args);
    }


}
