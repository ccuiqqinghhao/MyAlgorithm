package Main2;

import java.util.Scanner;
public class Main {
     public static int n;//�ܸ���
     public static int max = 0;//���
     public static int[] value;
    
    public void getResult() {
        for(int i = 0;i < n;i++) {//�ӵڼ�����ʼ???
             int[] temp = new int[n];//���ƺ������
             for(int k = 0;k < n;k++)//����value
                 temp[k] = value[k];
             int sum = 0;
             int count = 1;//��1��ʼ��
             int start = i;//�ӵ�iԪ�ظ���ʼ��
             while(true) {
                 boolean judge = true;//
                 for(int k = 0;k < n;k++) {
                	 if(temp[k] >= count) {//�����еĵ�k�������ڵ���count
                		 judge = false;
                		 break;
                     }
                 }
                 if(judge) {//���count�������е���������whileѭ��
                     break;
                 }
                 int j = start % n;//
                 if(temp[j] == count) {//�ҵ����ҵ���
                     sum = sum + count;
                     temp[j] = -1;//��ʾ�Ƴ���
                     count = 1;
                 } else if(temp[j] != -1) {//����Ȳ���û�б��Ƴ�
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
         n = in.nextInt();//n���ܸ���
         value = new int[n];
         for(int i = 0;i < n;i++)
             value[i] = in.nextInt();
         test.getResult();
     }
 }