package com.thorine.ba01;

import org.springframework.stereotype.Component;


/*
* @component:创建对象,等同于<bean></bean>
*   属性: value 就是对象的名称，也就是bean的id值，值是唯一的，创建的对象整个spring容器只有一个
*   位置：在类的上面
*
*       spring中和@component功能一致，创建对象的注解还有:

        1.@Repository (用在持久层类的上面):放在dao的实现类上面，
        表示创建dao对象，dao对象是能访问数据库的。
        2.@Service(用在业务层类的上面):放在service的实现类上面，
        创建service对象,service对象是做业务处理，可以有事务等功能的。
        3.@Controller(用在控制器的上面):放在控制器（处理器）类的上面，创建控制器对象的
        控制器对象,能够接受用户提交的参数，显示请求的处理结果。

        以上三个注解的使用语法和@Component一样的。都能创建对象，但是这三个注解还有额外的功能。
        @Repository , @Service , @controller是给项目的对象分层的。

        只要不创建属于以上三个的种类的类对象，就使用 @Component
* */

// @Component(value = "myStudent") 正规用法
// @Component("myStudent") 省略 value 用法
@Component // 则会创建由 spring 默认指定名称的对象，即 student
public class Student {
    private String name;
    private Integer age;

    public Student() {
        System.out.println("Student 无参构造方法执行...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
