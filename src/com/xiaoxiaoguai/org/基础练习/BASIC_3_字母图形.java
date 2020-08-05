package com.xiaoxiaoguai.org.基础练习;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 6:59 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_3_字母图形 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        //分解结构
        for (int i = 0 ; i < row ; i++){
            // 前段部分
            for (int k = 0 ; k < i ; k++)
                System.out.print( (char)(65 + i - k ));
            // 后段部分
            for (int l = 0 ; l < column - i ; l++ )
                System.out.print( (char)(65 + l));
            System.out.println();
        }
    }
}
