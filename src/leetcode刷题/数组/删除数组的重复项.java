package leetcode刷题.数组;

import 常用函数.Tool;

/**
 * @ClassName 删除数组的重复项--p26
 * @Author swj
 * @Date 2020/12/21 14:07
 * p26
 */
public class 删除数组的重复项 {
    //暴力解法-使用移动解法
    public static int removeDuplicates(int[] nums) {
        //标志当前值
        int temp = nums[0];
        int len = nums.length;
        for (int i =1 ;i<nums.length;){
            if(temp == nums[i]){
                premove(nums,i);
                len--;
            }else{
                temp = nums[i];
                i++;
            }
        }
        return len;

    }
    //双指针，最佳解法
    public static  int removeDuplivstes2(int[] nums){

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    //移动函数
    public static void premove(int[] num,int t){
        int i =t;
        while(i<num.length-1){
            num[i]=num[i+1];
            i++;
        }
        num[num.length-1]++;
    }

    public static void main(String[] args) {
        int[] num = {1,1,2};
        System.out.println(removeDuplivstes2(num));
        Tool.printArr(num);
    }
}
