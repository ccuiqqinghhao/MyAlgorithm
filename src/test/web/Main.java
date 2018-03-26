package test.web;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<3){
			System.out.println(1);
			System.exit(0);
		}
		System.out.println(f(n));
	}
	public static long f(int n){
		long num1=1;
		long num2=1;
		long sum=0;
		for(int i=3;i<=n;i++){
			
			long temp =num2;
			num2=(num1+num2);
			num1=temp;
			sum=num2%10007;
		}
		
		return sum;
	}
}
