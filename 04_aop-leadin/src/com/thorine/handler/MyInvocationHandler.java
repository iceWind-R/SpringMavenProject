package com.thorine.handler;

import com.thorine.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    // 目标对象
    private Object target; // SomeServiceImpl类

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行了MyInvocationHandler的invoke方法");
        System.out.println("Method方法名：" + method.getName());

        // 通过代理对象执行方法时，会调用这个invoke()

        Object result = null;

        ServiceTools.doLog(); // 方法增强

        // 执行目标类的方法，通过Method类实现
        result = method.invoke(target, args); // SomeServiceImpl.doOther,doSome()

        ServiceTools.doTrans(); // 方法增强

        // 目标方法执行的结果
        return result;
    }
}
