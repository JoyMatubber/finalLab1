package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.SchemaOutputResolver;
import java.time.LocalDate;


public class App {
    public static <localDate> void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);



        LocalDate date= LocalDate.now();
        System.out.println("Current date is : "+date);

        Mid mid = applicationContext.getBean("mid", Mid.class);
        Final fina = applicationContext.getBean("final", Final.class);



   if(String.valueOf(date) == mid.getDate())
   {
       Exam iA = applicationContext.getBean("mid", Exam.class);
       System.out.println(iA.exam());
   }
   else if(String.valueOf(date) == fina.getDate())
   {
       Exam iA = applicationContext.getBean("final", Exam.class);
       System.out.println(iA.exam());
   }
   else
   {
        System.out.println(date+ " - - > In this time  no exam is going on.");
   }



    }
}
