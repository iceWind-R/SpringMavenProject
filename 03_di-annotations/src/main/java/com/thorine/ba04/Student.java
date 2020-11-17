package com.thorine.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("myStudent")
public class Student {

    @Value("张三")
    private String name;
    @Value("26")
    private Integer age;

    /**
     * @Resource: 来自jdk的注解，spring对其提供了支持，也是自动注入的原理，默认byName
     */

    //@Resource  默认byName,如果byName找不到,byType
    @Resource(name = "school") // 只使用byName
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
