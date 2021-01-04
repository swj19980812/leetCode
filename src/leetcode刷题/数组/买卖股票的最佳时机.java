package leetcode刷题.数组;

/**
 * @ClassName 买卖股票的最佳时机
 * @Author swj
 * @Date 2020/12/30 11:24
 * p-121-123
 */
public class 买卖股票的最佳时机 {
    //买卖股票的最佳时机-普通算法
    public int maxProfit1(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int max = 0;
        int pre =prices[0];
        for(int i =0 ;i<prices.length;i++){
            pre = Math.min(pre,prices[i]);
            max = Math.max(max,prices[i] - pre);
        }
        return max;
    }

    //买卖股票的最佳时机2--贪心
    public int maxProfit2(int[] prices) {
        if(prices == null || prices.length<=0){
            return 0;
        }
        int max = 0;
        int pre = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > pre){
                max+=prices[i]-pre;
            }
        }
        return max;
    }
    //买卖股票的最佳时机2--动态规划
    public static int maxProfit3(int[] prices){
        if(prices == null || prices.length<=0){
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0] - prices[i]);
        }
        System.out.println(dp[prices.length-1][0]);
        return dp[prices.length-1][0];
    }
    //买卖股票的最佳时机3--动态规划
    /**
     * 思路--股票的分2次买进，一共有5个状态，初始，第一次买入，第一次卖出，第二次买入，第二次卖出
     *
     * 当前状态的改变依赖于上次状态的改变，重要的是第一次买入值的初始变化，和第二次买入值的初始变化
     * 第一次买入的当前变化在初始化的时候就已经改变，重要的是判断第二次买入值的初始化时间。
     * 第二次初始化的买入时间，在第一次卖出值的变化。
     * 上面是动态规划的初始化的值。dp动态规划代表的值，代表当前位置的最大值。他的变化是由上次的值的变化和上次前一个状态值的变化
     *
     *
     * ps：第三次买入的初始化，也可以在当前所开始的时候给出初始化函数，为-prices[0]
     * @param prices
     * @return
     */
    public static int maxProfit4(int[] prices){
        if(prices == null || prices.length<=0){
            return 0;
        }
        int[][] dp = new int[prices.length][5];
        dp[0][1] = -prices[0];
        int flag = 0;
        int flag1 = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
            dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]+prices[i]);
            if(flag == 1){
                dp[i][4] = Math.max(dp[i-1][4],dp[i-1][3]+prices[i]);
            }
            if(dp[i-1][2] !=0){
                if(dp[i-1][3] > dp[i-1][2] - prices[i]){
                    dp[i][3] = dp[i-1][3];
                }else {
                    dp[i][3] =  dp[i-1][2] - prices[i];
                    flag = 1;
                }
                if (flag == 0){
                    dp[i][3] =  dp[i-1][2] - prices[i];
                    flag = 1;
                }
            }

        }
        for (int[] ints : dp) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

        return Math.max(dp[prices.length-1][2],dp[prices.length-1][4]);

    }

    public static void main(String[] args) {
        System.out.println(maxProfit4(new int[]{3,3,5,0,0,3,1,4}));
    }

}
