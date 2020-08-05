package com.xiaoxiaoguai.org.基础练习;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 8:50 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_9_特殊回文数 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //五位数
        for (int i = 10001 ; i <= 99999 ; i++){
            int gewei = i%10;
            int shiwei = i/10%10;
            int baiwei = i/100%10;			//1102
            int qianwei = i/1000%10;
            int wanwei = i / 10000;
            int sum = gewei +  shiwei + baiwei + qianwei + wanwei;
            if(n == sum && gewei == wanwei && shiwei == qianwei)
                System.out.println(i);
        }
        //六位数
        for (int i = 100001 ; i <= 999999 ; i++){
            int gewei = i%10;
            int shiwei = i/10%10;
            int baiwei = i/100%10;			//1102
            int qianwei = i/1000%10;
            int wanwei = i / 10000 % 10;
            int shiwanwei = i / 100000;
            int sum = gewei +  shiwei + baiwei + qianwei + wanwei + shiwanwei;
            if( n == sum && gewei == shiwanwei && shiwei == wanwei && baiwei == qianwei )
                System.out.println(i);
        }
    }
}
