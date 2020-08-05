package com.xiaoxiaoguai.org.基础练习;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 6:44 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_11_十六进制转十进制 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Long.parseLong(str, 16));
    }
}
