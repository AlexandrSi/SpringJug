import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Show {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-jong.xml");
        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();
    }
}
