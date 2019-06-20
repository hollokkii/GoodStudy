package A_Ha_Suan_Fa;

import java.util.Scanner;
/**
 * @author:gujunming
 * @Date:2019/6/20 22:40
 * @Discription:
 *
 * 啊哈算法 一书中的  桶排序  完成
 *
 */
public class TongPaiXu {

    public static void main(String[] args) {
        int[] a = new int[11]; // 定义数组长度
        int i = 0;
        int j = 0;
        int t = 0;
       /* for ( i = 0; i<=10; i++ ){
            a[i] =0;3
        }*/
        for (i=1; i<=5; i++){
            Scanner scanner = new Scanner(System.in); //输入数据
            System.out.println("请输入数据：");
            if(scanner.hasNextInt()){  //判断输入的数据是不是 int
                t = scanner.nextInt();  //数组下标赋值
                if(t <=10 && t>=0){  //输入的值判断
                    a[t]++;  //输入的值符合条件  对应下标 数量加1，初始值是0
                }else{
                    System.out.println("输入的数据不符合规范！，请重新输入！");
                }
            }
        }
       for(int b = 1; b<a.length;b ++){
           System.out.println("------------"+a[b]+"-----------------");
       }

    }
}
