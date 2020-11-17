package com.thorine.service;

import com.thorine.handler.MyInvocationHandler;
import com.thorine.service.impl.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
//        // 调用doSome，doOther
//        SomeService service = new SomeServiceImpl();
//        service.doSome();
//        service.doOther();

        // 使用JDK 的proxy创建代理对象
        // 创建目标对象
        SomeService target = new SomeServiceImpl();

        // 创建InvocationHandler对象
        InvocationHandler handler = new MyInvocationHandler(target);

        // 使用proxy创建代理
        SomeService proxy = (SomeService) Proxy.newProxyInstance
                (target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);

        //通过代理执行方法，会调用handler中的invoke()
        proxy.doSome();
    }
}
