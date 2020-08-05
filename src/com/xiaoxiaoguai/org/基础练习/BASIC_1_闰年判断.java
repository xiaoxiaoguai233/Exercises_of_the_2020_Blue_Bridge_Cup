package com.xiaoxiaoguai.org.基础练习;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:25 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_1_闰年判断 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) 	//平闰年判断算法
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
