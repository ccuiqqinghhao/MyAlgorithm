package SeventhAboutConvince;

import java.util.HashSet;
import java.util.Set;
/*
 * 
 * 
ƽ����Ȧ

�����һ����������ÿһλ��ƽ��������ͣ��õ�һ���µ���������
���²���������������ͬ���Ĵ���

���һ������ᷢ�֣����ܿ�ʼȡ����ʲô���֣�
���������������1����������ͬһ��ѭ��Ȧ��

��д�����ѭ��Ȧ�������Ǹ����֡�

����д��������֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
 * 
 * */
public class Main2_1 {
	static Set<Long> set=new HashSet<Long>();
	static long max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=5;
		while(true){
			
			long sum=0;
			while(num!=0){
				sum+=(num%10)*(num%10);
				num/=10;
				//System.out.println(sum);
			}
			if(!set.contains(sum)&&sum!=1){
				set.add(sum);
			}else{
				break;
			}
			
			max=Math.max(max, sum);
			num=sum;
		}
		
		System.out.println(max);
	}

}
