package MyRecursion;

public class Main3 {
	//字符串最大公共子序列的长度
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=f("abasdfagwafwafcd","ascfs");
		System.out.println(k);
	}
	public static int f(String s1,String s2) {
		
		if(s1.length()==0|s2.length()==0)
			return 0;
		if(s1.charAt(0)==s2.charAt(0))
			return f(s1.substring(1),s2.substring(1))+1;
		else
			return Math.max(f(s1,s2.substring(1)),f(s1.substring(1),s2));
		
	}

}
