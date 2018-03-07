package eighthTestwithmyself;


/*
 *
标题：纸牌三角形

A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
下图就是一种排法（如有对齐问题，参看p1.png）。

      A
     9 6
    4   8
   3 7 5 2

这样的排法可能会有很多。

如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？

请你计算并提交该数字。

注意：需要提交的是一个整数，不要提交任何多余内容。

---------------------------

笨笨有话说：
    感觉可以暴力破解哦。
    麻烦的是，对每个排法还要算出它的旋转、镜像排法，看看有没有和历史重复。

歪歪有话说：
    人家又不让你把所有情况都打印出来，只是要算种类数。
    对于每个基本局面，通过旋转、镜像能造出来的新局面数目不是固定的吗？


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
