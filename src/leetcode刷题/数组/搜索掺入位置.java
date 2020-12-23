package leetcode刷题.数组;

import 常用函数.GenerateData;
import 常用函数.Print;

/**
 * @ClassName 搜索掺入位置
 * @Author swj
 * @Date 2020/12/23 19:23
 * p35
 */
public class 搜索掺入位置 {

    public static void main(String[] args) {
        int[]  nums = {1,2,3,4,5,7,8,9};
        int u = searchInsert(nums,6);
        System.out.println(u);
    }
    //查出插入位置 返回left值，mid值只能返回查找位置，无法返回插入位置
    public static int searchInsert(int[] nums, int target) {
        //搜索插入位置-第一次思路-使用二分查找
        //return search(nums,target,0,nums.length-1);
        //使用循环来做二分查找
        int left =0;
        int right = nums.length-1;
        int mid = 0;
        while (left <=right){
            mid = (left+right)/2;
            if(nums[mid] == target){
                break;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return mid;
    }
    //使用递归的二分查找
    public int search(int[] nums,int target,int left ,int end){
        if(left >= end){
            if(target<=nums[left]){
                return left;
            }else{
                return left+1;
            }
        }
        int mid = (left+end)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return search(nums,target,left,mid-1);
        }else{
            return search(nums,target,mid+1,end);
        }
    }
}
