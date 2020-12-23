package 数据结构.表和栈和队列.使用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 全排列，找出排列的下一个排列
 * @author swj
 * @data 2020年11月11日
 */
public class ArrayUse1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] nums = {1,3,2};
		//Arrays.sort(list);
		//Arrays.sort(nums);
		Arrays.parallelSort(nums);
		for(int a : nums) {
			System.out.println(a);
		}
		
	}
	private void find(int nums[]) {
		int i = nums.length -2;
		while(i>=0 && nums[i]>=nums[i+1]) {
			i--;
		}
		if(i>=0) {
			int j = nums.length -1;
			while(j>=0 &&nums[i]>=nums[j] ) {
				j--;
			}
			if(j>=0) {
				swap(nums,i,j);
			}
			
		}
		resver(nums,i);
	}
	
	private void swap(int nums[],int i,int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	private void resver(int nums[],int start) {
		int left = start+1;
		int right = nums.length-1;
		while(left<right) {
			swap(nums,left,right);
			left++;
			right--;
		}
	}
}
