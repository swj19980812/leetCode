package leetcode刷题.数组;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。说明：你不能倾斜容器。
 * @author swj
 * @data 2020年11月26日
 *
 */
public class 盛最多水的容器 {
	
	/**
	 * 解决方案：使用双指针，i从头开始，j从尾部开始，
	 * 当i位置所在的值高于j位置所在的值时，j往前进一位，反之i进一位。面积的求和，根据最短的那个来
	 * 下一个更大值的出现必然要求短的那个往前进一位
	 * @param height
	 * @return
	 */
	public static int maxArea(int[] height) {
		int len = height.length;
		int i = 0;
		int j = len-1;
		int maxArea = 0;
		int area=0;
		int flag = 0;
		while(i<=j) {
			area = (j-i)*(height[j]>height[i] ? height[i] : height[j]);
			if(area > maxArea) {
				maxArea = area;
			}
			if(height[i]>height[j]) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println(maxArea);
		return maxArea;
    }

	
	
	public static void main(String[] args) {
		int[] num = {4,3,2,1,4};
		maxArea(num);
	}
}
