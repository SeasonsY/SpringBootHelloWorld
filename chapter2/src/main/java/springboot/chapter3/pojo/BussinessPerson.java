package springboot.chapter3.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import springboot.chapter3.pojo.definition.Animal;
import springboot.chapter3.pojo.definition.Person;

@Component
public class BussinessPerson implements Person{
    private Animal animal = null;

    @Override
    public void service(){
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal){
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }
}
