package leetcode刷题.数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 杨辉三角
 * @Author swj
 * @Date 2020/12/29 10:49
 */
public class 杨辉三角 {

    //动态规划解决杨辉三角的问题
    public static List<List<Integer>> generate(int num){
        int[][] dp = new int[num+1][num+1];
        dp[0][1] =1;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <num+1; i++) {
            List<Integer> ll = new ArrayList<>();
            for (int i1 = 1; i1 <=i; i1++) {
                dp[i][i1] = dp[i-1][i1-1]+dp[i-1][i1];
                ll.add(dp[i][i1]);
            }
            list.add(ll);
        }
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        return list;
    }
    //动态规划解决杨辉三角2的问题
    public static List<Integer> generate2(int num){
        List<Integer>list = new ArrayList<>();
        if(num<0){
            return list;
        }
        int[][] dp = new int[num+2][num+2];
        dp[0][1] =1;
        for (int i = 1; i <num+2; i++) {
            for (int i1 = 1; i1 <=i; i1++) {
                dp[i][i1] = dp[i-1][i1-1]+dp[i-1][i1];
            }
        }
        for (int i = 1; i < dp[num+1].length; i++) {
            list.add(dp[num+1][i]);
        }
            return list;
    }

    public static void main(String[] args) {
        System.out.println(generate2(0));
    }

}
