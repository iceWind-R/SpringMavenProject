# SpringMavenProject

————我的spring入门学习
---
## 文件说明
- 01_hello-spring : spring 的 helloWorld 程序
- 02_di-xml : 通过xml配置文件 创建对象并给对象的属性赋值
    - 赋值分为两种：简单赋值和引用赋值
    - xml配置分为两种，一种为set注入，一种为构造注入
    - 自动注入：byName 和 byType
    - 多配置文件
- 03_di-annotations : 通过**注解**创建对象并给对象属性赋值

    注解包括：
    - @Component : 创建普通类对象
    - @Repository : 创建dao实现类对象
    - @service : 创建service实现类对象
    - @Controller : 创建controller实现类对象
    - @Value : 给对象的属性赋值
    - @Autowired : spring提供的，引用类型的属性的自动注入
    - @Resource : jdk6以上提供的，spring 支持的引用类型属性自动注入

- 04_aop-leadin : 实现动态代理。即在程序的执行过程中，创建代理对象。通过代理对象的执行方法，给目标类的方法增加额外的功能（功能增强）,AOP的本质就是规范化的动态代理。
    
    JDK动态代理实现步骤：
    
    1. 创建目标类，SomeserviceImpl目标类，给它的doSome，doother增加 输出时间，事务。
    2. 创建InvocationHandler接口的实现类，在这个类实现给目标方法增加功能。
    3. 使用jdk中类 *Proxy* , 创建代理对象。实现创建对象的能力。
