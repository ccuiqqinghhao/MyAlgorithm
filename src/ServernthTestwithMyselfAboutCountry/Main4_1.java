package ServernthTestwithMyselfAboutCountry;
/*
 * 
·��֮��

С��ð��X�������ʿ��������һ����ֵĳǱ���
�Ǳ����ʲô��û�У�ֻ�з���ʯͷ�̳ɵĵ��档

����Ǳ������� n x n �����񡣡���ͼ1.png����ʾ��

��ϰ�ף���ʿҪ���������ߵ����Ͻǡ�
���Ժ���������ƶ���������б���ߣ�Ҳ������Ծ��
ÿ�ߵ�һ���·��񣬾�Ҫ��������������������һ����
���Ǳ�����ǽ�ͱ�ǽ�ڸ��� n �����ӣ�


ͬһ������ֻ������һ�Ρ��������������еķ���

���ֻ���������ϼ�����Ŀ�������ƶϳ���ʿ������·����

��ʱ�ǿ��Եģ�����ͼ1.png�е����ӡ�

�����Ҫ�������֪�������֣�����ʿ������·�����������ݱ�֤·��Ψһ��

���룺
��һ��һ������N(0<N<20)����ʾ������ N x N ������
�ڶ���N���������ո�ֿ�����ʾ���ߵļ����ϵ����֣������򶫣�
������N���������ո�ֿ�����ʾ���ߵļ����ϵ����֣��Ա����ϣ�

�����
һ�����ɸ���������ʾ��ʿ·����

Ϊ�˷����ʾ������Լ��ÿ��С������һ�����ִ����������ǿ�ʼ���: 0,1,2,3....
���磬ͼ1.png�еķ�����Ϊ��

0  1  2  3
4  5  6  7
8  9  10 11
12 13 14 15


ʾ����
�û����룺
4
2 4 3 4
4 3 3 3

����Ӧ�������
0 4 5 1 2 3 7 11 10 9 13 14 15



��ԴԼ����
��ֵ�ڴ����� < 256M
CPU����  < 1000ms


���ϸ�Ҫ���������Ҫ��������ش�ӡ���ƣ�����������...�� �Ķ������ݡ�

���д������ͬһ��Դ�ļ��У�����ͨ���󣬿����ύ��Դ�롣
ע�⣺��Ҫʹ��package��䡣��Ҫʹ��jdk1.7�����ϰ汾�����ԡ�
ע�⣺��������ֱ����ǣ�Main��������Ч���봦��



 * 
 * 
 * */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4_1 {
	static int n;
	static int north[];
	static int west[];
	static int[][] map;
	static int[] load;
	static int northSum=0;
	static int westSum=0;
	static int bushu=1;// x y   x y   x  y    x y
	static int[][] four={{0,1},{1,0},{0,-1},{-1,0}};//�� �� �� ��
	
	
	
	
	public static void f(int x,int y){
		if(x==n-1&&y==n-1){
			if(westSum==0&&northSum==0){
				for(int i=0;i<bushu;i++)
					System.out.print(load[i]+" ");
			}
		}
		
		for(int i=0;i<4;i++){
			int dx=x+four[i][0];
			int dy=y+four[i][1];
			if(dx>=0&&dx<n&&dy>=0&&dy<n&&north[dy]>0&&west[dx]>0&&map[dx][dy]!=-1){
				west[dx]--;
				westSum--;
				north[dy]--;
				northSum--;
				load[bushu]=map[dx][dy];
				bushu++;
				f(dx,dy);
				bushu--;
				west[dx]++;
				westSum++;
				north[dy]++;
				northSum++;
				
			}
		}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʼ��
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		north=new int[n];
		west=new int[n];
		map=new int[n][n];
		load=new int[n*n];
		int temp=0;
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map[i].length;j++)
				map[i][j]=temp++;
		for(int i=0;i<north.length;i++){
			north[i]=in.nextInt();
			northSum+=north[i];
		}
		for(int i=0;i<west.length;i++){
			west[i]=in.nextInt();
			westSum+=north[i];
		}
		north[0]--;
		northSum--;
		west[0]--;
		westSum--;
		map[0][0]=-1;
		load[0]=0;
		f(0,0);
		
		
	}
	
}

