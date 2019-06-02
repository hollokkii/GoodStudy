package com.xdl.ThinkInJava;


import java.util.Random;

import static net.mindview.util.Print.print;

/**
 * @author:gujunming
 * @Date:2019/2/17 14:04
 * @Discription:
 *
 * Think In Java
 *
 * 第三章
 * 3.5  算术操作符
 *
 */
public class MathOps {

    public static void main(String[] args){
        // create a seeded random number generator(创建 一个随机数生成器)
        /**
         * @Date:2019/2/17 14:39
         * @Discription:
         * 想要获取一个范围内的随机数（例如26，随机数可能是0-25），首先需要一个种子（其实就是一个数值）。
         *     每个种子会对应这个范围内（0-26）的唯一的一个随机数。
         *     47这个种子在26这个范围内，所对应的随机数为24，所以每次随机得出的结果都为24.
         *     （注意：47在26这个范围内对应的是24，这个是死的，固定的，无论你执行多少次，它还是24）
         *     至于为什么种子47会对应24，这个涉及到java封装的算法，有兴趣可以深入了解。
         * ---------------------
         *
         */

        /**
         * @Date:2019/2/17 14:41
         * @Discription:
         * 总之，new Random(47)里面的47表示产生随机数的一个种子，nextInt(26)表示随机数的范围，
         * 种子和范围是相关联的，一个种子对应一个范围内的一个固定的随机数，如果不填种子，
         * 则会默认取当前时间的毫秒数作为种子来生成随机数
         */
        Random rand = new Random(47);
        int i,j,k;
        //choose value from 1 to 100;(选择1到100之间的值)
        j = rand.nextInt(100)+1;
        print("j : "+j );
        k = rand.nextInt(100)+1;
        print("k : "+k);
        i = j+k;
        print("j+k : "+i);
        i = j-k;
        print("j-k : "+i);
        i = k / j;
        print("k/j : "+i);
        i = j * k;
        print("j*k :" +i);
        i = k % j;
        print("k%j :" +i);
        j %= k;
        print("j %= k :"+j);
        //float-point number tests  (浮点数测试);
        float u , v, w;//applies to doubles,too(也适用于double类型)
        v = rand.nextFloat();
        print("v : " + v);
        w = rand.nextFloat();
        print("w :"+w);
        u = v+w;
        print("v+w :"+u);
        u = v-w;
        print("v-w :"+u);
        u = v*w;
        print("v*w :"+u);
        u = v/w;
        print("v/w :"+u);
        //the following also works for char,
        //byte,short ,int ,long,and double(以下内容也适用char，byte,short ,int ,long,and double)
        u+=v;
        print("u+=v :" +u);
        u-=v;
        print("u-=v :" +u);
        u*=v;
        print("u*=v :" +u);
        u/=v;
        print("u/=v :" +u);

    }
}
