package SeventhAboutConvince;

import java.util.Scanner;
/*
 * 
��������

X����Ŀ���ѧ�ҷ�����һ���Ŵ������������롣
��Щ��������A��B��C��D ����ֲ������Ӵ��ɵ����С�
��ϸ�������֣���Щ���봮����Ӧ����ǰ��ԳƵģ�Ҳ��������˵�ľ��񴮣���
���������Զ������������������ˣ�������ܻ�ʧȥ�����������

��������ǣ�
����һ�����ڿ��������봮������һ�´ӵ�����״̬����Ҫ����������ٸ����ӣ��ſ��ܻ������ڵ����ӡ�

����һ�У���ʾ���ڿ��������봮�����Ȳ�����1000��
Ҫ�����һ������������ʾ���������˶��ٸ����ӡ�

���磬���룺
ABCBA
�����Ӧ�������
0

�����磬���룺
ABDCDCBABC
�����Ӧ�������
3

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 3000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��
 * 
 * */
public class Main9_1 {
	static String s;
	static int min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		min=s.length();
		f(0,s.length()-1,0);
		System.out.println(min);
	}
	public static void f(int left,int right,int num){
		if(left>=right){
			min=min>num?num:min;
		}else{
			if(s.charAt(left)==s.charAt(right)){
				f(left+1,right-1,num);
			}else{
				f(left+1,right,num+1);
				f(left,right-1,num+1);
			}
		}
		return;
	}

}
