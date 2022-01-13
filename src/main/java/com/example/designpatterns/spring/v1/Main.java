package com.example.designpatterns.spring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static void main(String[] args)  {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Tank tank=(Tank) context.getBean("tank");
        tank.run();


    }
}
