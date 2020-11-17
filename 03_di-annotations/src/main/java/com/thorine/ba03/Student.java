package com.thorine.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
    /*
    * @Value:简单类型的属性赋值
    * 属性：value 是 String 类型的，表示简单类型的属性值
    * 位置：
    *       1、在属性定义的上面，无需set方法，推荐使用。
    *       2、在set方法上
    * */

    @Value("张飞")
    private String name;
    @Value("29")
    private Integer age;

    /**
     * 引用类型
     * @Autowired: 实现引用类型的赋值，是自动注入的原理，支持byName,byType
     * 默认使用byType自动注入
     * 位置：属性定义的上面，无需使用set方法
     *
     * 属性：required，是一个Boolean类型，默认为 true，表示若引用类型赋值失败，则报错并中止程序运行
     * 若是false，则程序正常执行，引用类型赋值为 null
     *
     * 如果要使用byName方式，则在属性上面加 @Autowired 和 @Qualified(value="bean的id"): 表示使用指定名称的bean赋值
      */
    @Autowired(required = false)
    // @Qualifier("mySchool") 打开注释则代表byName
    private School school;

    public Student() {
        System.out.println("Student 无参构造...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
