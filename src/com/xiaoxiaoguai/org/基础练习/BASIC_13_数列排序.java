package com.xiaoxiaoguai.org.基础练习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 6:46 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_13_数列排序 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for(int i = 0 ; i < n ; i++)
            array[i] = sc.nextInt();

        Arrays.sort(array);

        for(int x : array)
            System.out.print(x+" ");

    }
}
