package main1;

public class Main{
	public static void main(String[] args) {
		int max=0;
		int he=0;
		for(int i=1;i<=100;i++) {
			
			while(i!=0) {
				
				int j=i%10;
				he+=j*j;
				i/=10;
			}
			
			i=he;
			he=0;
		}
		System.out.println(max);
	}
}
