package com.xiaoxiaoguai.org.入门训练;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:05 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BEGIN_2_序列求和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        if( num == 1)
            System.out.println(num);
        else
            System.out.println((num+1)*(num/2));
    }
}
