package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);//this is the class that defines the configuration

//        Doctor doc = context.getBean(Doctor.class);
//        doc.assist();
//        Nurse nurse = (Nurse) context.getBean("nurse"); //it gets data as an object cuz it doesn't know the type yet
//        nurse.assist();

//        Staff staff = (Staff) context.getBean("doc");
//        staff.assist();

//        Staff staff1 = context.getBean(Nurse.class);
//        staff1.assist();

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("homeo");

        ((ConfigurableApplicationContext)context).close(); //to call predestory()
//        System.out.println(doctor);

//        Doctor doc = context.getBean(Doctor.class);
//        System.out.println(doc);
    }
}
