package com.xdl.ThinkInJava;

import net.mindview.util.Print;

import static net.mindview.util.Print.print;

/**
 * @author:gujunming
 * @Date:2019/2/17 12:47
 * @Discription:
 *  think in java
 *   第三章
 *
 *   3.4 操作符
 *
 */
class Tank{
    int level;
}
public class Assignment {

    public static void main(String [] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        print("1:t1.level :" +t1.level+",  t2.level :"+t2.level);
        t1 = t2 ;
        print("2:t1.level : "+t1.level+",  t2.level :"+t2.level);
        t1.level = 27 ;  //当t1 调用 level 引用并且赋值 27,此时的level 已经变成27，当t2 的引用在去调用level，
                         // 所以t2.level的值也是27
        print("3:t1.level : "+t1.level+",  t2.level :"+t2.level);
    }

}
