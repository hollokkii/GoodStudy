package com.xdl.ThinkInJava;
/**
 * @author:gujunming
 * @Date:2019/2/20 22:47
 * @Discription:
 * think in java
 * 第三章
 * 3.7.1  测试对象的等价性
 *
 */
public class Equivalence {

    public static void main(String[] args) {
        Equivalence  e1 = new Equivalence();
        Equivalence  e2 = new Equivalence();
        System.out.println(e1 == e2);
        System.out.println(e1 != e2);

        Integer n1  = new Integer(47);
        Integer n2 =  new Integer(47);
        System.out.println("==========================================");
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
        System.out.println("=======================================");
        System.out.println(n1.equals(n2));

    }

}
