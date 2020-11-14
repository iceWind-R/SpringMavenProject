import com.thorine.ba02.School;
import com.thorine.ba02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test01(){
        String config = "ba01\\applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }

    @Test
    public void test02(){
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);

        School school = new School();
        school.setName("董奥");
        school.setAddress("石家庄");

        student.setSchool(school);

        System.out.println(student);
    }

    @Test
    public void test03(){
        String config = "ba02\\applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student myStudent = (Student) ac.getBean("myStudent");
        System.out.println(myStudent);
    }


}
