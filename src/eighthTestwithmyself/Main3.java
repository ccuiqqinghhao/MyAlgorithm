package eighthTestwithmyself;

public class Main3 {
	static double [][]nums =new double[][]{
		{7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{5,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{7,8,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{9,2,7,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{8,1,4,9,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{8,1,8,8,4,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{7,9,6,1,4,5,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{5,6,5,5,6,9,5,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{5,5,4,7,9,3,5,5,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{7,5,7,9,7,4,7,3,3,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{4,6,4,5,5,8,8,3,2,4,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{1,1,3,3,1,6,6,5,5,4,4,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{9,9,9,2,1,9,1,9,2,9,5,7,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{4,3,3,7,7,9,3,6,1,3,8,8,3,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{3,6,8,1,5,3,9,5,8,3,8,1,8,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{8,3,2,3,3,5,5,8,5,4,2,8,6,7,6,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{8,1,8,1,8,4,6,2,2,1,7,9,4,2,3,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0},
		{2,8,4,2,2,9,9,2,8,3,4,9,6,3,9,4,6,9,0,0,0,0,0,0,0,0,0,0,0,0},
		{7,9,7,4,9,7,6,6,2,8,9,4,1,8,1,7,2,1,6,0,0,0,0,0,0,0,0,0,0,0},
		{9,2,8,6,4,2,7,9,5,4,1,2,5,1,7,3,9,8,3,3,0,0,0,0,0,0,0,0,0,0},
		{5,2,1,6,7,9,3,2,8,9,5,5,6,6,6,2,1,8,7,9,9,0,0,0,0,0,0,0,0,0},
		{6,7,1,8,8,7,5,3,6,5,4,7,3,4,6,7,8,1,3,2,7,4,0,0,0,0,0,0,0,0},
		{2,2,6,3,5,3,4,9,2,4,5,7,6,6,3,2,7,2,4,8,5,5,4,0,0,0,0,0,0,0},
		{7,4,4,5,8,3,3,8,1,8,6,3,2,1,6,2,6,4,6,3,8,2,9,6,0,0,0,0,0,0},
		{1,2,4,1,3,3,5,3,4,9,6,3,8,6,5,9,1,5,3,2,6,8,8,5,3,0,0,0,0,0},
		{2,2,7,9,3,3,2,8,6,9,8,4,4,9,5,8,2,6,3,4,8,4,9,3,8,8,0,0,0,0},
		{7,7,7,9,7,5,2,7,9,2,5,1,9,2,6,5,3,9,3,5,7,3,5,4,2,8,9,0,0,0},
		{7,7,6,6,8,7,5,5,8,2,4,7,7,4,7,2,6,9,2,1,8,2,9,8,5,7,3,6,0,0},
		{5,9,4,5,5,7,5,5,6,3,5,3,9,5,8,9,5,4,1,2,6,1,4,3,5,3,2,4,1,0},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double min=Double.MAX_VALUE;
		double max=Double.MIN_VALUE;
		for(int h=1;h<=29;h++){
			for(int i=0;i<=h;i++){
				if(i==0){
					nums[h][0]+=nums[h-1][0]/2;
				}else{
					nums[h][i]+=nums[h-1][i-1]/2+nums[h-1][i]/2;
				}
			}
		}
		for(int i=1;i<nums[29].length;i++){
			if(min>nums[29][i])min=nums[29][i];
			else if(max<nums[29][i])max=nums[29][i];
		}
		System.out.println(2086458231/min*max);
	}
	
}
