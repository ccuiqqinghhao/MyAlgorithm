package eighthTestwithmyself;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
/*

���⣺����������

    X��������г��������ܣ�һ����������ɫ����ɫ�ͺ�ɫ��
    X����ľ���ϲ�������Ƿ���һ�Ų豭��������Թ۲�����������ȥ��
    ����ͼ����һ�ű��ӣ���ߵ�һ���ǿ��ŵģ��ұߵı��ӣ�ÿ�������һֻ���ܡ�

*WWWBBB

    ���У�W��ĸ��ʾ��ɫ���ܣ�B��ʾ��ɫ���ܣ�*��ʾ�ձ��ӡ�

    X�ǵ����ܺ���Щ�ã�����ֻ��3������֮һ��
    1. �������ڵĿձ����
    2. ����1ֻ���������ܣ����ʲô��ɫ�������ձ����
    3. ����2ֻ���������ܣ����ʲô��ɫ�������ձ����

    ������ͼ�ľ��棬ֻҪ1�����Ϳ�������ͼ���棺

WWW*BBB

��������������֪��ʼ���棬ѯ��������Ҫ����������������һ��Ŀ����档

����Ϊ2�У�2��������ʾ��ʼ�����Ŀ����档
���Ҫ��Ϊһ����������ʾ������Ҫ���ٲ�����������

���磺
���룺
*WWBB
WWBB*

�����Ӧ�������
2

�����磬
���룺
WWW*BBB
BBB*WWW

�����Ӧ�������
10

����Լ��������Ĵ��ĳ��Ȳ�����15

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��

----------------------------

�����л�˵��
    ���μ��Լ���һ�ô�����
    ������Ծ��
    �Ҿͷ����µ�֦����
    ��������ǵ� 5 �����֦,
    Ŷ��������֦��Ҷï��



*/
public class Main8 {
	static String end;
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String start=sc.next();
		 end=sc.next();
		
		LinkedList<Info> list = new LinkedList<>();
		list.add(new Info(start,0));
		f(list);
	}
	//��ͷ�ϻ�ȡ
	//���µļ���ĩβ
	public static void f(LinkedList<Info> list){
		while(!list.isEmpty()){
			Info current = list.remove();
			if(current.now.equals(end)){
				System.out.println(current.count);
				return;
			}
			
			
			if(set.contains(current.now)) continue;
			else set.add(current.now);
			
			
			
			int index=current.now.indexOf('*');
			for(int i=0;i<current.now.length();i++){
				if(current.now.charAt(i)=='*')continue;
				if(Math.abs(i-index)<=3){
					char[] temp=current.now.toCharArray();
					
					char ff = current.now.charAt(i);
					temp[index] = ff;
					temp[i] = '*';
					
					String r = new String(temp);
					list.addLast(new Info(r,current.count+1));
					
				}
			}
		}
	}
}

class Info{
	String now;
	int count;
	public Info(String now,int count){
		this.now=now;
		this.count=count;
	}
}
