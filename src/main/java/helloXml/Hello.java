package helloXml;

/**
 * Created by zjluoyue on 2016/7/25.
 */
public class Hello {

//    private String message;

    private String message1;

    private String message2;

//    public void getMessage() {
//        System.out.println("Your message: " + message);
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }


    public void getMessage2() {
        System.out.println("Your message: " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage1() {
        System.out.println("Your message: " + message1);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public void init() {
        System.out.println("Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}
