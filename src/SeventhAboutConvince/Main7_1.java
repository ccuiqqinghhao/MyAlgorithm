package SeventhAboutConvince;

import java.util.Scanner;

public class Main7_1 {
	static long max=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long l=sc.nextLong();

		for(int i=1;i<=l;i++){
			long m=f(i);
			max=Math.max(max,m);
		}
		System.out.println(max);
	}
	public static long f(int i){
		long m=0;
		while(true){
			m=Math.max(m,i);
			if(Math.sqrt(i)%2==0||i==1){
				break;
			}
			if(i%2!=0){
				i*=3;
				i++;
			}else if(i%2==0){
				i/=2;
			}
		}
		return m;
	}
}
