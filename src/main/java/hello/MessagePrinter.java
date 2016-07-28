package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zjluoyue on 2016/7/24.
 */
@Component
public class MessagePrinter {

    private MessageServer messageServer;

    @Autowired
    public MessagePrinter(MessageServer messageServer) {
        this.messageServer = messageServer;
    }

    public void printMessage() {
        System.out.println(this.messageServer.getMessage());
    }
}
