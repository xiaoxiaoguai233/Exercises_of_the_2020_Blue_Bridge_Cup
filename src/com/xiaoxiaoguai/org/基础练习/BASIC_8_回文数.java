package com.xiaoxiaoguai.org.基础练习;

/**
 * @Auther 吴泽胜同学
 * @Date 2020-08-05 6:42 下午
 * @Adress 湖北师范大学 计算机与信息工程学院 18届
 * UsingIDEA  IntelliJ IDEA
 */

public class BASIC_8_回文数 {

    public static void main(String[] args) {
        for(int i = 1000 ; i < 10000 ; i++){
            int gewei = i%10;
            int shiwei = i/10%10;
            int baiwei = i/100%10;			//1102
            int qianwei = i/1000;

            if(gewei == qianwei && shiwei == baiwei){
                System.out.println(i);
            }
        }
    }
}
