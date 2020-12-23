package 常用函数;

/**
 * @ClassName Tool
 * @Author swj
 * @Date 2020/12/21 11:28
 */
public class Tool {

    public static void preMove(int[] num,int t){
        int i =t;
        while(i<num.length-1){
            num[i]=num[i+1];
            i++;
        }
    }
    public static void printArr(int[] num){
        for (int i : num) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] num = {0,1,2,4,5,6,7,8,8};
        preMove(num,1);
        printArr(num);
    }
}
