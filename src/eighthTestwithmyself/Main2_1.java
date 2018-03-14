package eighthTestwithmyself;

public class Main2_1 {
	static int count=0;
	static int[] nums={1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		f(nums,0);
		System.out.println(count/6);
	}
	public static void f(int[] nums,int k){
		
		if(k==nums.length)
			if(nums[0]+nums[1]+nums[2]+nums[3]==nums[3]+nums[4]+nums[5]+nums[6]&&nums[3]+nums[4]+nums[5]+nums[6]==nums[6]+nums[7]+nums[8]+nums[0])
			count++;
		
		
		for(int i=k;i<nums.length;i++){
			change(i,k);
			f(nums,k+1);
			change(i,k);
		}
		
	}
	public static void change(int a,int b){
		int num=nums[a];
		nums[a]=nums[b];
		nums[b]=num;
	}
}
