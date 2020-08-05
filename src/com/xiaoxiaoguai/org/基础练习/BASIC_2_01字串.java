package com.xiaoxiaoguai.org.基础练习;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 4:29 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_2_01字串 {

    public static void main(String[] args) {
        for(int i=0;i<32;i++){
            String result = Integer.toBinaryString(i);
            int  n = Integer.parseInt(result);
            System.out.printf("%05d\n",n);
        }
    }
}
