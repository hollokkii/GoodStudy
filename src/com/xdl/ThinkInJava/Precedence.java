package com.xdl.ThinkInJava;
/**
 * @author:gujunming
 * @Date:2019/2/15 22:32
 * @Discription:
 *  think  in java
 *  3. 操作符
 *  3.3优先级 demo
 *
 */
public class Precedence {

    public static void main(String [] args){
        int x = 1,y = 2, z =3;
        int a = x + y - 2/2 +z;
        int b = x + (y - 2)/(2 + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a = "+ a +" b ="+ b);
    }
}
