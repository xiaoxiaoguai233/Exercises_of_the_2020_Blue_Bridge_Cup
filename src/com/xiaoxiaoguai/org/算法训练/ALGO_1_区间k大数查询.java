package com.xiaoxiaoguai.org.算法训练;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 10:26 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * @UsingIDEA  IntelliJ IDEA
 */

public class ALGO_1_区间k大数查询 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //输入n，创建序列数组。
        int n = sc.nextInt();
        int array[] = new int[n];
        //输入序列
        for (int i = 0 ; i < n ; i++)
            array[i] = sc.nextInt();
        //创建搜索序列num，创建搜索序列。
        int num = sc.nextInt();
        int SearchNumber [][] = new int[num][3];
        //输入搜索序列
        for (int i = 0 ; i < num ; i++)
            for (int j = 0 ; j < 3 ; j++)
                SearchNumber[i][j] = sc.nextInt();

        //处理问题
        for (int i = 0 ; i < num ; i++){
            int size_temp = SearchNumber[i][1] - SearchNumber[i][0];
            int array_temp[] = new int[size_temp+1];

            for (int j = SearchNumber[i][0] - 1,k = 0 ; j < SearchNumber[i][1] ; j++,k++)
                array_temp[k] = array[j];

            Arrays.sort(array_temp);
            System.out.println(array_temp[size_temp+1-SearchNumber[i][2]]);
        }
    }
}
