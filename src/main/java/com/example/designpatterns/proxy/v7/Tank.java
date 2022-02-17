package com.example.designpatterns.proxy.v7;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？
 * v05:使用代理
 * v06:代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator?
 * v07:代理的对象改成Movable类型-越来越像decorator了
 * v08:如果有stop方法需要代理...
 * 如果想让LogProxy可以重用，不仅可以代理Tank，还可以代理任何其他可以代理的类型
 * （毕竟日志记录，时间计算是很多方法都需要的东西），这时该怎么做呢？
 * 分离代理行为与被代理对象
 * 使用jdk的动态代理
 *
 * v09: 横切代码与业务逻辑代码分离 AOP
 * v10: 通过反射观察生成的代理对象
 * jdk反射生成代理必须面向接口，这是由Proxy的内部实现决定的
 */
public class Tank implements Movable {

    @Override
    public void move() {
        long start=System.currentTimeMillis();
        System.out.println("dingingi............................");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) {

     new LogProxy(new TimeProxy(new Tank())).move();
    }

}

class TimeProxy implements Movable {

    Movable movable;

    public TimeProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        long start=System.currentTimeMillis();
        movable.move();
        long end=System.currentTimeMillis();
        System.out.println("TimeProxy:"+(end-start));
    }
}

class LogProxy implements Movable {

    Movable movable;

    public LogProxy(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start log....");
        movable.move();
        System.out.println("end log....");
    }
}


interface Movable {
    void move();
}
