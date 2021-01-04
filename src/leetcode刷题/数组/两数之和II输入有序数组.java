package leetcode刷题.数组;

/**
 * @ClassName 两数之和II输入有序数组
 * @Author swj
 * @Date 2021/1/4 15:38
 */
public class 两数之和II输入有序数组 {
    public int[] twoSum(int[] numbers, int target) {
        int[] index = new int[2];
        int i =0;
        int j = numbers.length-1;
        while(i<=j){
            if(numbers[i]+numbers[j] > target){
                j--;
            }else if(numbers[i]+numbers[j] < target){
                i++;
            }else{
                index[0] = i+1;
                index[1] = j+1;
                return index;
            }
        }
        return index;
    }
}
