package leetcode刷题.数组;

import 常用函数.Tool;

import java.util.Arrays;

/**
 * @ClassName 最小序列和
 * @Author swj
 * @Date 2020/12/23 22:57
 * p53
 */
public class 最小序列和 {
    public static void main(String[] args) {
        int[] nums ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sumMax(nums));
        System.out.println(sumMax2(nums));
    }
    //贪心算法求解
    public static int sumMax(int[] nums){
        int pre = 0;
        int max = nums[0];
        for (int num : nums) {
            pre = Math.max(num,pre+num);
            max = Math.max(max,pre);
        }
        return max;

    }
    //动态规划算法求解
    public static int sumMax2(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>0){
                nums[i]+=nums[i-1];
            }

        }
        return Tool.max(nums);
    }




}
