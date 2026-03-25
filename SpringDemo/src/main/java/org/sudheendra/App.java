package org.sudheendra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj1 = (Alien) context.getBean("alien");
//        can provide class to prevent typecasting
        Alien obj1 =  context.getBean("alien",Alien.class);
//        obj1.age = 24;
//        obj1.setAge(24);
        System.out.println(obj1.getAge());
        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien");
//        System.out.println(obj2.age);
//        obj2.code();

        Desktop obj2 = (Desktop) context.getBean("comp2");
    }
}
