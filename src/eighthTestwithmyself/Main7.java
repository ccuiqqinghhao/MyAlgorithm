package eighthTestwithmyself;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
/*
���⣺����

С��ʱ�������ֽ����Ϸ��
��һ�ֽ���������������Ϸ������ܼ򵥣�ȴ������С���ѡ�

�����������£�
����μ���Ϸ��С������A��B����Ϸ��ʼ��ʱ�����ǵõ��������ֽ���������£�
A����[K, 8, X, K, A, 2, A, 9, 5, A]
B����[2, 7, K, 5, J, 5, Q, 6, K, 4]

���е�X��ʾ��10�������Ǻ�����ֽ�ƵĻ�ɫ��

��A����ʼ��A��B˫���������ơ�

���ֵ�ĳһ������ʱ�������Լ���ֽ�ƶ��е�ͷ������һ�ţ��ŵ����ϣ�����ѹ��������һ��ֽ���ϣ�����еĻ�����

�����У���Ϸ���̣�
A��K��B��2��A��8��B��7��A��X����ʱ���ϵ�����Ϊ��

K,2,8,7,X

���ֵ�B����ʱ��������K�����ϵ�ֽ�������е�K��ͬ����Ѱ���K���ڵ��Լ�����K֮���ֽ�ƶ�Ӯ�����������Լ��ƵĶ�β��ע�⣺Ϊ�˲������㣬�����Ƶ�˳���������ϵ�˳���෴�ġ�
��ʱ��A��B˫����������Ϊ��
A����[K, A, 2, A, 9, 5, A]
B����[5, J, 5, Q, 6, K, 4, K, X, 7, 8, 2, K]

Ӯ�Ƶ�һ���������ơ�Ҳ����B���ų�5��A��K��B��J��A��A��B��5����Ӯ���ˡ�
5,K,J,A,5
��ʱ˫�������ƣ�
A����[2, A, 9, 5, A]
B����[Q, 6, K, 4, K, X, 7, 8, 2, K, 5, A, J, K, 5]

    ע�⣺�����ʱ��Ӯ�Ƶ�һ�������ܰ����ϵ��ƶ�Ӯ�ߣ�����������ͬ�Ƶ㼰���м�Ĳ��֡���������Σ�����Ӯ�Ƶ�һ���������ƣ��е�ʱ���һ������Ӯ�ˣ�Ҳ������ġ�

    ��ĳһ�������������һ���ƣ����޷���������Ӯȡ��ʱ����Ϸ����������

    ���ڱ����ĳ�ʼ��������£����A���������B����������Ϊ��

9K2A62KAX58K57KJ5

    ��������������֪˫����ʼ���򣬼�����Ϸ����ʱ��Ӯ��һ����������򡣵���Ϸ�޷�����ʱ�����-1��

����Ϊ2�У�2�������ֱ��ʾA��B˫����ʼ����������С�
���Ϊ1�У�1��������ʾA�ȳ��ƣ����Ӯ��һ�����������

���磬
���룺
96J5A898QA
6278A7Q973

�����Ӧ�������
2J9A7QA6Q6889977

�ٱ��磬
���룺
25663K6X7448
J88A5KJXX45A

�����Ӧ�������
6KAJ458KXAX885XJ645

����Լ��������Ĵ��ĳ��Ȳ�����30

��ԴԼ����
��ֵ�ڴ����ģ���������� < 256M
CPU����  < 1000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
��������ֱ����ǣ�Main��������Ч���봦��

----------------------------
    
�����л�˵��
    ����ɾ��ǰ�ߵģ���Ҫ������.... ��������飬��Ҫ��һ�����ģ�����汣������Ϸ����ǰ�������õ�����ı�Ե��

�����л�˵��
    ������Ҳ����������ÿ�β���������һ���µĴ���

ĬĬ�л�˵��
    ��һ�㶼��֨�������ǵ��͵Ķ��нṹ����̬������ã�û�У��Լ���һ���£�

*/
/*public class Main7 {
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
}*/
