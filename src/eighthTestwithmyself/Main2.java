package eighthTestwithmyself;


/*
 *
���⣺ֽ��������

A,2,3,4,5,6,7,8,9 ��9��ֽ���ų�һ���������Σ�A��1���㣩��Ҫ��ÿ���ߵĺ���ȡ�
��ͼ����һ���ŷ������ж������⣬�ο�p1.png����

      A
     9 6
    4   8
   3 7 5 2

�������ŷ����ܻ��кܶࡣ

���������ת���������ͬ����ͬһ�֣�һ���ж����ֲ�ͬ���ŷ��أ�

������㲢�ύ�����֡�

ע�⣺��Ҫ�ύ����һ����������Ҫ�ύ�κζ������ݡ�

---------------------------

�����л�˵��
    �о����Ա����ƽ�Ŷ��
    �鷳���ǣ���ÿ���ŷ���Ҫ���������ת�������ŷ���������û�к���ʷ�ظ���

�����л�˵��
    �˼��ֲ�����������������ӡ������ֻ��Ҫ����������
    ����ÿ���������棬ͨ����ת����������������¾�����Ŀ���ǹ̶�����


 */
public class Main2 {
	static int count=0;
	static int nums[]={1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(nums,0);
		System.out.println(count/6);
	}
	public static boolean check(){
		int a=nums[0]+nums[1]+nums[2]+nums[3];
		int b=nums[3]+nums[4]+nums[5]+nums[6];
		int c=nums[6]+nums[7]+nums[8]+nums[0];
		if(a==b&&b==c)return true;
		return false;
	}
	public static void change(int i,int k){
			int n=nums[i];
			nums[i]=nums[k];
			nums[k]=n;
	}
	
	public static void f(int[] nums,int k){
		if(k==nums.length)
			if(check())count++;
				
		for(int i=k;i<nums.length;i++){
			change(i,k);
			f(nums,k+1);
			change(i,k);
		}
	}
	
}
