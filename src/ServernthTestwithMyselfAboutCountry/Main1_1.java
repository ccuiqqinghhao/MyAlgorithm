package ServernthTestwithMyselfAboutCountry;
/*
 * 
��������

��ͼ��ͼ1.png����ʾ��

���߽��ǵ�14���ڵ�������1~14 �����֣����ظ�������©��
Ҫ��ÿ��ֱ���ϵ��ĸ�����֮�ͱ�����ȡ�

ͼ���Ѿ�������3�����֡�
���������λ��Ҫ�������֣���Ψһ��

��ú����ύ��ɫ�ڵ��4�����֣������ң��ÿո�ֿ���

���磺12 5 4 8
��Ȼ���ⲻ����ȷ�Ĵ𰸡�

ע�⣺ֻ�ύ4���ÿո�ֿ������֣���Ҫ��д�κζ�������ݡ�

 * 
 * */
public class Main1_1 {
	static int nums[]={1,2,3,4,5,7,8,9,10,12,13};
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		f(0);
		
	}
	public static void f(int k){
		if(k==nums.length){
			int i1=nums[0]+nums[1]+nums[2]+nums[3];
			int i2=6+nums[2]+nums[4]+11;
			int i3=nums[3]+nums[4]+nums[5]+nums[6];
			int i4=nums[5]+nums[7]+nums[8]+11;
			int i5=nums[6]+nums[7]+nums[9]+14;
			int i6=nums[8]+nums[9]+nums[10]+nums[0];
			int i7=nums[10]+nums[1]+6+14;
			if(i1==i2&&i2==i3&&i3==i4&&i4==i5&&i5==i6&&i6==i7){
				System.out.println(nums[0]+" "+nums[1]+" "+nums[2]+" "+nums[3]);
				return;
			}
		}
		
		for(int i=k;i<nums.length;i++){
			change(i,k);
			f(k+1);
			change(i,k);
		}
	}
	public static void change(int a,int b){
		int temp=nums[a];
		nums[a]=nums[b];
		nums[b]=temp;
	}
}
