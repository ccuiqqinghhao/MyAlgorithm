package ServernthTestwithMyselfAboutCountry;
/*
 * 
七星填数

如图【图1.png】所示。

在七角星的14个节点上填入1~14 的数字，不重复，不遗漏。
要求每条直线上的四个数字之和必须相等。

图中已经给出了3个数字。
请计算其它位置要填充的数字，答案唯一。

填好后，请提交绿色节点的4个数字（从左到右，用空格分开）

比如：12 5 4 8
当然，这不是正确的答案。

注意：只提交4个用空格分开的数字，不要填写任何多余的内容。

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
