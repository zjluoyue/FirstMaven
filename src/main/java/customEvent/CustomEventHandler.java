package customEvent;

import org.springframework.context.ApplicationListener;

/**
 * Created by zjluoyue on 2016/7/28.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
