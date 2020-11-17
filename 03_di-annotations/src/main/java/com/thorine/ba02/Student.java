package com.thorine.ba02;

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

    public Student() {
        System.out.println("Student 无参构造...");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
