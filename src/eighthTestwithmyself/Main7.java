package eighthTestwithmyself;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder a=new StringBuilder(sc.next());
		StringBuilder b=new StringBuilder(sc.next());
		StringBuilder desk=new StringBuilder();
		int sin=0;
		boolean isA=true;
		while(true){
			if(a.length()==0||b.length()==0){
				break;
			}
			if(a.length()==1||b.length()==1){
				sin++;
				if(sin>50){
					System.out.println("-1");
					return;
				}
			}
			if(isA){
				char temp=a.charAt(0);
				a.deleteCharAt(0);
				desk.append(temp+"");
				int first=desk.indexOf(temp+"");
				if(first>=0&&first!=desk.length()-1){
					a.append(new StringBuilder(desk.substring(first)).reverse());
					desk.delete(first, desk.length());
					
				}else{
					isA=!isA;
				}
			}else{
				char temp=b.charAt(0);
				b.deleteCharAt(0);
				desk.append(temp+"");
				int first=desk.indexOf(temp+"");
				if(first>=0&&first!=desk.length()-1){
					b.append(new StringBuilder(desk.substring(first)).reverse());
					desk.delete(first, desk.length());
					
				}else{
					isA=!isA;
				}
				
				
			}
			
		}
		if(a.length()==0)System.out.println(b);
		else System.out.println(a);
	}

}
