package IntInt;

public class nCiMi {
//��һ������n����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=2;
		System.out.println(f(a,b));
	}
	public static int f(int a,int b){
		if(b==1)return a;
		return a*f(a,b-1);
	}
}
