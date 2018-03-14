package eighthTestwithmyself;

import java.util.Scanner;

public class Main6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c=new char[27];
		for(int i=0;i<c.length;i++){
			c[i]=(char)('A'+i-1);
		}
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		StringBuilder sb=new StringBuilder();
		while(num>0){
			int x=(int)num%26;
			if(x==0)x=26;
			if(x<=26){
				sb.append(c[x]);
			}
			num=(num-x)/26;
		}
		
		System.out.println(sb.reverse().toString());
	}

}
