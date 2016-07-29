package utils;

import advice.Student;
import collection.JavaCollection;
import customEvent.CustomEventPublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import text.TextEditor;

/**
 * Created by zjluoyue on 2016/7/25.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
//        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

//        TextEditor te = (TextEditor) ctx.getBean("textEditor");
//        te.spellCheck();
//        System.out.println(te.getName());
//        JavaCollection jc = (JavaCollection) ctx.getBean("javaCollection");
//        jc.getAddressList();
//        jc.getAddressMap();
//        jc.getAddressProp();
//        jc.getAddressSet();

//        CustomEventPublisher cep = (CustomEventPublisher) ctx.getBean("customEventPublisher");
//
//        cep.publish();

        Student st = (Student) ctx.getBean("student");
        st.getName();
        st.getAge();
        st.printThrowException();
    }
}
