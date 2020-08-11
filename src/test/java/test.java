import com.kong.service.BookServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {


    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImp bsi = context.getBean("bookServiceImp", BookServiceImp.class);
        System.out.println(bsi.queryAllBooks());

    }
}
