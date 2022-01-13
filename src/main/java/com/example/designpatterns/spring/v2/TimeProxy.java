package com.example.designpatterns.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TimeProxy {


    @Pointcut("execution(void com.example.designpatterns.spring.v2.Tank.run())")
    public void pointCut(){

    }



    @Before("pointCut())")
    public void before(){
        System.out.println("before2............");
    }


    @After("pointCut()")
    public void after(){
        System.out.println("after2.............");
    }
}
