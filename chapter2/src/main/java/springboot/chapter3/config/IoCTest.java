package springboot.chapter3.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.chapter3.pojo.BussinessPerson;

import java.util.logging.Logger;

public class IoCTest {
    private static Logger log = Logger.getLogger("IoCTest");
    public static void main(String args[]){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        BussinessPerson person = ctx.getBean(BussinessPerson.class);
        person.service();
    }
}
