package SeventhAboutConvince;
/*
 * 
 * 
ú����Ŀ

��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
....
���һ����100�㣬���ж��ٸ�ú��

�����ʾú������Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�

 * */
public class Main1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=1;
		long sum=1;
		for(int i=2;i<=100;i++){
			num+=i;
			sum+=num;
			
			
			//sum+=f(i);
		}
		System.out.println(sum);
	}
	public static int f(int level){
		if(level==1){
			return 1;
		}else{
			return f(level-1)+level;
		}
	}
}
