package com.xdl.ThinkInJava;

import static net.mindview.util.Print.print;

/**
 * @author:gujunming
 * @Date:2019/2/17 13:27
 * @Discription:
 *
 *  Think in java
 *  第三章
 *  3.4.1  方法调用中的别名问题
 *
 */
class Letter{
    char c ;
}
public class PassObject {

    //将一个对象传递给一个方法的时候也会产生别名问题

    static void f(Letter y){
       y.c = 'z';
    }
    public static void main(String[] args){
       Letter l = new Letter();
       l.c = 'a';
       print("1 : l.c = " + l.c );
       f(l);
       print("2: l.c = " +l.c);

    }
}
