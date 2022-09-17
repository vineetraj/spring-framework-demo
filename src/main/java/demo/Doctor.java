package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope(scopeName = "singleton")
@Component //-> to treat this class as a component.
// we can remove from here, if we have defined our bean in BeanConfig.java with @Bean
public class Doctor implements Staff, BeanNameAware {
    /* BeanNameAware: This interface is implemented by beans that want to be aware of their bean name in a bean factory.
     This name will be used as a reference to the bean object.
     Note: It makes Spring Bean aware of spring environment. use @Autowired instead
    */

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

/*
//Doctor constructor with qualification

    public Doctor(String qualification) {
        this.qualification = qualification;
    }
*/

    public void assist() {
        System.out.println("doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name) { //a part of BeanNameAware interface
        // we can obtain the name of the bean by implementing this interface
        // name here refers to the bean's name
        // This method sets the name of the bean in the bean factory that created this bean.
        // it gets called before creating the object
        System.out.println("set bean method called with name = "+name);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("post construct called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("pre destroy called");
    }
//NOTE: it won't get called in prototype.Also, will need to add shutdown hook & close context

}
