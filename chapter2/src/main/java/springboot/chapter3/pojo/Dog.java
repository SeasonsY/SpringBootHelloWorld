package springboot.chapter3.pojo;

import org.springframework.stereotype.Component;
import springboot.chapter3.pojo.definition.Animal;

@Component
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【"+Dog.class.getSimpleName()+"】是看门用的。");
    }
}
