package com.xiaoxiaoguai.org.基础练习;

import java.util.Scanner;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 5:02 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_6_杨辉三角形 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr=new int[n][n];

        for(int i=0;i<arr.length; i++) {
            //由于只是给杨辉三角内的位置赋值，所以是j<=i
            for(int j=0;j<=i;j++) {
                //根据规律，使用if else 赋值
                if(j==0||j==i) {
                    arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
				/*由于只是输出杨辉三角范围内的值，所以在内层循环就输出，这种方法不能全部赋值完之后再输出
					"\t"的原因是10和小于10的数组的宽度不同，所以使用\t制表符能使数与数之间距离相等
				*/
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
