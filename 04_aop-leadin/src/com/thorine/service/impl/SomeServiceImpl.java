package com.thorine.service.impl;

import com.thorine.service.SomeService;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        //ServiceTools.doLog();
        System.out.println("执行doSome()...");
        //ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
        //ServiceTools.doLog();
        System.out.println("执行doOther()...");
        //ServiceTools.doTrans();
    }
}
