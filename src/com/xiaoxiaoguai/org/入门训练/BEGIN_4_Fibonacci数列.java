package com.xiaoxiaoguai.org.入门训练;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:22 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BEGIN_4_Fibonacci数列 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[num+2];
        a[1]=1;
        a[2]=1;
        for(int i=3;i<=num;i++) {
            a[i]=(a[i-1]+a[i-2])%10007;
        }
        System.out.println(a[num]);
    }
}
