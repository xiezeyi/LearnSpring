package com.kuang.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private  Rect rect;

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    //生成得到代理类
    public  Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rect.getClass().getInterfaces(),this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(rect, args);
        return result;
    }
    public void seehouse(){
        System.out.println("中介带看房子");
    }
}
