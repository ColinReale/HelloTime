package hello;

import org.joda.time.LocalTime;

import java.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        hello.Greeter greeter = new hello.Greeter();
        System.out.println(greeter.sayHello());
    }
}