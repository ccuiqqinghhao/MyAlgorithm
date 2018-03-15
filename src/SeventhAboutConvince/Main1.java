package SeventhAboutConvince;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<101;i++){
			sum+=f(i);
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
