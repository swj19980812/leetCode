package leetcode刷题.数组;

/**
 * @ClassName 合并2个有效数组
 * @Author swj
 * @Date 2020/12/28 16:34
 * p-88
 */
public class 合并2个有效数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i= m-1;
        int j = n-1;
        int k =nums1.length - 1;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i];
                i--;
            }else{
                nums1[k--] = nums2[j];
                j--;
            }
        }
        if(j==0){
            while(i>=0){
                nums1[k--] = nums1[i];
                i--;
            }
        }
        if(i<=0){
            while(j>=0){
                nums1[k--] = nums1[j];
                j--;
            }
        }

    }
}
