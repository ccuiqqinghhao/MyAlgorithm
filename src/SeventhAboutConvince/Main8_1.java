package SeventhAboutConvince;

import java.util.Scanner;
/*
 * 
��ƽ����

��ƽ���Ͷ������ֳ�Ϊ�������ն�����
ÿ�������������Ա�ʾΪ����4����������ƽ���͡�
�����0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡�

���磺
5 = 0^2 + 0^2 + 1^2 + 2^2
7 = 1^2 + 1^2 + 1^2 + 2^2
��^���ű�ʾ�˷�����˼��

����һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����
Ҫ�����4��������
0 <= a <= b <= c <= d
�������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��


��������Ϊһ��������N (N<5000000)
Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ�

���磬���룺
5
�����Ӧ�������
0 0 1 2

�����磬���룺
12
�����Ӧ�������
0 2 2 2

�����磬���룺
773535
�����Ӧ�������
1 1 267 838

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 3000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦����

 * 
 * */
public class Main8_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num=in.nextInt();
		int n=(int) Math.sqrt(num)+1;
		for(int a=0;a<n;a++){
			for(int b=0;b<n;b++){
				for(int c=0;c<n;c++){
					for(int d=n;d>0;d--){
						if(num==a*a+b*b+c*c+d*d){
							System.out.println(a+" "+b+" "+c+" "+d);
							return;
						}
					}
				}
			}
		}
	}

}