package SeventhAboutConvince;

public class Main5_1 {
	static float nums[]=new float[]{1,2,3,4,5,6,7,8,9};
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		System.out.println(count);
	}

	public static void f(int k){
		if(k==nums.length){
			float a=nums[0];
			float b=nums[1]/nums[2];
			float c=nums[3]*100+nums[4]*10+nums[5];
			float d=nums[6]*100+nums[7]*10+nums[8];
			float sum=a+b+(c/d);
			//System.out.println(sum);
			if(Math.abs(sum-10.0)<10E-20){
				count++;
			}
		}
		for(int i=k;i<nums.length;i++){
			change(i,k);
			f(k+1);
			change(i,k);
		}
	}
	public static void change(int a,int b){
		float temp=nums[a];
		nums[a]=nums[b];
		nums[b]=temp;
	}
}
