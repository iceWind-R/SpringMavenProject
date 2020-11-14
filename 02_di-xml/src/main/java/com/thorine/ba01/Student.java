package com.thorine.ba01;

public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
        System.out.println("setName():"+name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("setAge():"+age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
