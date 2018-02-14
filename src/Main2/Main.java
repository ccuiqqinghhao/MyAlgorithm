package Main2;

import java.util.Scanner;
public class Main {
     public static int n;//总个数
     public static int max = 0;//结果
     public static int[] value;
    
    public void getResult() {
        for(int i = 0;i < n;i++) {//从第几个开始???
             int[] temp = new int[n];//复制后的数组
             for(int k = 0;k < n;k++)//复制value
                 temp[k] = value[k];
             int sum = 0;
             int count = 1;//从1开始数
             int start = i;//从第i元素个开始数
             while(true) {
                 boolean judge = true;//
                 for(int k = 0;k < n;k++) {
                	 if(temp[k] >= count) {//数组中的第k个数大于等于count
                		 judge = false;
                		 break;
                     }
                 }
                 if(judge) {//如果count大于其中得数则跳出while循环
                     break;
                 }
                 int j = start % n;//
                 if(temp[j] == count) {//找到了找到了
                     sum = sum + count;
                     temp[j] = -1;//表示移除了
                     count = 1;
                 } else if(temp[j] != -1) {//不相等并且没有被移除
                     count++;
                 }
                 start++;
             }
             max = Math.max(max, sum);
         }
         System.out.println(max);
     }
    
     public static void main(String[] args) {
         Main test = new Main();
         Scanner in = new Scanner(System.in);
         n = in.nextInt();//n是总个数
         value = new int[n];
         for(int i = 0;i < n;i++)
             value[i] = in.nextInt();
         test.getResult();
     }
 }