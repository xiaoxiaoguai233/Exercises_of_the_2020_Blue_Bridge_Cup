package com.xiaoxiaoguai.org.基础练习;

import sun.lwawt.macosx.CSystemTray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:53 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_5_查找整数 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[num];

        for(int i = 0 ; i < num ; i++)
            array[i] = sc.nextInt();

        int search = sc.nextInt();

        int get = -1;
        for(int i = 0 ; i < num ; i++)
            if(array[i] == search){
                get = i+1;
                break;
            }

        System.out.println(get);
    }
}
