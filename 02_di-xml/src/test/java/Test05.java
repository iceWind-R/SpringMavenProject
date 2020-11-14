import com.thorine.ba05.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void test01(){
        String config = "ba05/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("student");
        System.out.println("Student对象：" + student);
    }
}
