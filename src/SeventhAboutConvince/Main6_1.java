package SeventhAboutConvince;

public class Main6_1 {
	static int nums[]=new int[]{0,1,2,3,4,5,6,7,8,9};
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		System.out.println(count);
	}
	public static void f(int k){
		if(k==nums.length){
			if(nums[0]<nums[1]&&nums[0]<nums[2]&&
					nums[1]<nums[3]&&nums[1]<nums[4]&&
					nums[2]<nums[4]&&nums[2]<nums[5]&&
					nums[3]<nums[6]&&nums[3]<nums[7]&&
					nums[4]<nums[7]&&nums[4]<nums[8]&&
					nums[5]<nums[8]&&nums[5]<nums[9])
				count++;
			
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
