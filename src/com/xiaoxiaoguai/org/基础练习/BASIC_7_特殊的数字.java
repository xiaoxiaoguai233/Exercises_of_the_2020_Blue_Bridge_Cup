package com.xiaoxiaoguai.org.基础练习;

import static java.lang.Math.pow;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 8:40 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_7_特殊的数字 {

    public static void main(String[] args) {

        for (int num = 100 ; num < 999 ; num++){
            int baiwei = num / 100;
            int shiwei = num / 10 % 10;
            int gewei = num % 10;

            int sum = (int)(pow(baiwei,3) + pow(shiwei,3) + pow(gewei,3));
            if( num == sum)
                System.out.println(num);
        }
    }
}
