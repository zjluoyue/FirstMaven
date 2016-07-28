package helloXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zjluoyue on 2016/7/25.
 */
public class MainApp {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
//        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        ctx.start();
        Hello printer = (Hello) ctx.getBean("hello");
//        printer.getMessage();
        printer.getMessage1();
        printer.getMessage2();

        HelloChina chinaPrinter = (HelloChina) ctx.getBean("helloChina");
        chinaPrinter.getMessage1();
        chinaPrinter.getMessage2();
        chinaPrinter.getMessage3();
        ctx.stop();
//        ctx.registerShutdownHook();

    }
}
