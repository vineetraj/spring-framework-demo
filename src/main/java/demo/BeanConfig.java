package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //-> to treat this as a configuration class
@ComponentScan(basePackages = "demo") //-> to tell spring where we need to scan the component
public class BeanConfig {

    /*
        @Bean //-> when you're loading anything, this is the bean of type Doctor you need to load.
        //I'm defining bean myself. It will be available in the container. it will act as a bean
        //to make this work, we need to remove @Component from Doctor.java
        public Doctor doctor(){
            return new Doctor();
        }
    */
}
