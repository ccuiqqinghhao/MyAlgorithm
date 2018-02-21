package sixteenToEight;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=sc.nextInt();
		String[] s=new String[count];
		for(int i=0;i<s.length;i++) {
			s[i]=Integer.toOctalString(Integer.valueOf(sc.next(),16));
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
}
