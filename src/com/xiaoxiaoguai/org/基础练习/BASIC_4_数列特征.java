package com.xiaoxiaoguai.org.基础练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:50 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_4_数列特征 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arry[] = new int[num];

        for(int i = 0 ; i < num ; i ++)
            arry[i] = sc.nextInt();

        int Sum = 0;

        Arrays.sort(arry);

        for(int x : arry)
            Sum += x;

        System.out.println(arry[num-1]);
        System.out.println(arry[0]);
        System.out.println(Sum);
    }
}
