package eighthTestwithmyself;

public class Main0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num=651764141421415346185f;
		System.out.println(f(num));
	}
	public static float f(float num){
		if(num<=9)return num;
		return f(num%9);
			
	}
}
