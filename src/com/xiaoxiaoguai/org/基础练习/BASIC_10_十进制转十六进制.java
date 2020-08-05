package com.xiaoxiaoguai.org.基础练习;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 6:43 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_10_十进制转十六进制 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        System.out.println((Integer.toString(n,16)).toUpperCase());
    }
}
