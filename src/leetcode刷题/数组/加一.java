package leetcode刷题.数组;

/**
 * @ClassName 加一
 * @Author swj
 * @Date 2020/12/25 11:33
 *
 */
public class 加一 {

    //数组内变动
    public int[] plusOne(int[] digits) {
        int pre =1;
        for(int i =digits.length-1;i>=0;i--){
            pre = digits[i]+pre;
            if(pre >= 10){
                digits[i] = pre%10;
                pre = 1;
            }else{
                digits[i] = pre;
                pre =0;
            }
        }
        if(pre == 1){
            int[] nums = new int[digits.length+1];
            nums[0] = pre;
            for(int i=0;i<digits.length;i++){
                nums[i+1] = digits[i];
            }
            return nums;
        }
        return digits;

    }
}
