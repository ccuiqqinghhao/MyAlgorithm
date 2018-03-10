package eighthTestwithmyself;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Main8_1 {
	static String end;
	static LinkedList<Infoo> l=new LinkedList<Infoo>();
	static Set<String> set=new HashSet<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String start=sc.next();
		end=sc.next();
		
		
		l.add(new Infoo(start,0));
		f();
		
	}
	public static void f(){
		while(!l.isEmpty()){
			Infoo in=(Infoo)l.remove();
			if(in.now.equals(end)){
				System.out.println(in.count);
				return;
			}
			
			
			if(set.contains(in.now))continue;
			else set.add(in.now);
			
			
			
			int n=in.now.indexOf('*');
			for(int i=0;i<in.now.length();i++){
				if(in.now.charAt(i)=='*')continue;
				if(Math.abs(i-n)<=3){
					char[] c=in.now.toCharArray();
					
					char index=in.now.charAt(i);
					c[n]=index;
					c[i]='*';
					
					String s=new String(c);
					l.addLast(new Infoo(s,in.count+1));
				}
			}
		}
	}
	
}
class Infoo{
	String now;
	int count;
	public Infoo(String now,int count){
		this.now=now;
		this.count=count;
	}
}