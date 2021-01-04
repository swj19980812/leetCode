package leetcode刷题.数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName 多数元数
 * @Author swj
 * @Date 2021/1/4 15:15
 * p-169
 */
public class 多数元素 {
    //哈希表
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int key = 0;
        for(int num:nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (max <= map.get(num)) {
                max = map.get(num);
                key = num;
            }
        }
        return key;
    }
    //Boyer-Moore 投票算法
    public int majorityElement2(int[] nums) {
        int pre = 0;
        int count = 0 ;
        for (int num : nums) {
            pre = count == 0 ?num:pre;
            if(num == pre){
                count+=1;
            }else {
                count-=1;
            }

        }
        return pre;
    }

}
