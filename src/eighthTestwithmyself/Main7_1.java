package eighthTestwithmyself;

import java.util.Scanner;

public class Main7_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder A = new StringBuilder(in.next());
		StringBuilder B = new StringBuilder(in.next());
		StringBuilder PUBLIC = new StringBuilder();//�����ϵ���
		boolean who = true;//�ֵ�˭���г��ƣ�true��A,false��B
		int sin = 0;
		while(true) {
			if(A.length() == 0 || B.length() == 0) {
				break;
			}
			if(A.length() == 1 || B.length() == 1) {
				sin++;
				if(sin >= 50) {
					System.out.println(-1);
					return;
				}
			}
			if(who) {
				char t = A.charAt(0);
				A.deleteCharAt(0);//�Ƴ�����
				PUBLIC.append(t+"");//�ŵ�������
				int first = PUBLIC.indexOf(t+"");
				if(first != PUBLIC.length()-1) {//����������ͬ���ַ���˵��������
					A.append(new StringBuilder(PUBLIC.substring(first)).reverse());
					PUBLIC.delete(first, PUBLIC.length());
					//Ӯ�˲��û���
				}else {
					who = !who;//����
				}
			}else {
				char t = B.charAt(0);
				B.deleteCharAt(0);
				PUBLIC.append(t+"");
				int first = PUBLIC.indexOf(t+"");
				if(first != PUBLIC.length()-1) {//����������ͬ���ַ���˵��������
					B.append(new StringBuilder(PUBLIC.substring(first)).reverse());
					PUBLIC.delete(first, PUBLIC.length());
					//Ӯ�˲��û���
				}else {
					who = !who;//����
				}
			}
		}
		if(A.length() != 0) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
		
	}
}
