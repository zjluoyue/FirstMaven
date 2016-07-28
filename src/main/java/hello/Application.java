package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zjluoyue on 2016/7/24.
 */
@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageServer messageServerImpl() {
        return new MessageServer() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Application.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
