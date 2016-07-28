package customEvent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by zjluoyue on 2016/7/28.
 */
public class CustomEvent extends ApplicationEvent{
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My custom Event";
    }
}
