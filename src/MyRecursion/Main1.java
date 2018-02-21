package MyRecursion;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f("aaaba","aaaa",0));
	}
	//µÝ¹éÅÐ¶Ï×Ö·û´®ÊÇ·ñÏàµÈ
	public static Boolean f(String s1,String s2,int begin) {
		if(s1.length()!=s2.length())return false;
		if(0==s1.length())return true;
		if(s1.charAt(0)==s2.charAt(0)) 
			f(s1.substring(1, s1.length()),s2.substring(1, s2.length()),begin+1);
		return false;
		
	}
}
