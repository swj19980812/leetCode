package leetcode刷题.数组;

import java.util.HashMap;
import java.util.Map;

import 常用函数.Print;

public class 二数之和 {
	
	
    public static Integer[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> map = new HashMap();
    	Integer[] n = new Integer[2];
    	
        for(int i = 0;i<nums.length;i++) {
        	if(map.get(target-nums[i])!=null) {
        		n[1] = i;
        		n[0] = map.get(target-nums[i]);
        	}else {
        		map.put(nums[i],i);
        	}        	
        }
    	return n;
    }
	
    public static void main(String[] args) {
    	int[] nums = {2, 7, 11, 15};
    	int target = 9;
    	Print.print(twoSum(nums,target));
	
    }
}
