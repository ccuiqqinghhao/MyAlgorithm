package SeventhAboutConvince;

import java.util.Scanner;

public class Main9 {
	 static int min=0,num=0;
	    static String inputstr;
	    public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	        inputstr=scanner.next();
	        min=inputstr.length();//最小值赋值为长度
	        fcode(0, min-1, 0);//递归
	        System.out.println(min);
	    }
	    public static  void fcode(int left,int right,int num){
	        if (left>=right) {//左大于右
	            min=min<num?min:num;
	        }else {
	            if (inputstr.charAt(left)==inputstr.charAt(right)) 
	                fcode(left+1, right-1, num);
	            else {
	                fcode(left+1, right, num+1);
	                fcode(left, right-1, num+1);
	            }
	        }
	        return;
	    }
}
