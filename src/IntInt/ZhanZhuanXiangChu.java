package IntInt;

public class ZhanZhuanXiangChu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=40;
		int c=f(a,b);
		System.err.println(a*b/c);
		
	}
	public static int f(int d,int e){
		while(true){
			if(d==0){
				return e;
			}
			int t=d;
			d=e%d;
			e=t;
		}
	}
}
