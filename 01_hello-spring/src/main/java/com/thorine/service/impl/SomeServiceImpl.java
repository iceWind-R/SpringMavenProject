package com.thorine.service.impl;

import com.thorine.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("SomeService 的构造方法执行了");
    }
    @Override
    public void doSome() {
        System.out.println("执行了SomeServiceImpl的 doSome() 方法。");
    }
}
