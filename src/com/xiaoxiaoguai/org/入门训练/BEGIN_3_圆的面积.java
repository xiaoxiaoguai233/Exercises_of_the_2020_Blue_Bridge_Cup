package com.xiaoxiaoguai.org.入门训练;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:17 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BEGIN_3_圆的面积 {

    public static void main(String[] args) {

        double d = 3.14159265358979323;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(String.format("%.7f",r*r*d));
    }
}
