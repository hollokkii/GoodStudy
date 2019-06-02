package com.xdl.ThinkInJava;

import net.mindview.util.Print;

import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author:gujunming
 * @Date:2019/2/22 20:53
 * @Discription:
 *
 * think in java
 * 第三章
 *
 * 3.8 逻辑运算符
 *
 */
public class Bool {

    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);

        print("i = "+i);
        print("j = "+j);
        print(" i > j  is    " +(i>j));
        print(" i < j  is    " +(i<j));
        print(" i >=j  is    " +(i >= j));
        print(" i <= j  is   " +(i<=j));
        print(" i == j  is   " +(i == j));
        print(" i != j  is   " +(i != j));
        print("(i < 10)&&(j < 10) is " +((i<10) && (j <10)));
        print("(i < 10)||(j < 10) is " +((i<10) || (i < 10)));
    }

}
