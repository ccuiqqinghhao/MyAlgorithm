package SeventhAboutConvince;

import java.util.HashSet;
import java.util.Set;
/*
 * 
 * 
平方怪圈

如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
对新产生的正整数再做同样的处理。

如此一来，你会发现，不管开始取的是什么数字，
最终如果不是落入1，就是落入同一个循环圈。

请写出这个循环圈中最大的那个数字。

请填写该最大数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
 * 
 * */
public class Main2_1 {
	static Set<Long> set=new HashSet<Long>();
	static long max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=5;
		while(true){
			
			long sum=0;
			while(num!=0){
				sum+=(num%10)*(num%10);
				num/=10;
				//System.out.println(sum);
			}
			if(!set.contains(sum)&&sum!=1){
				set.add(sum);
			}else{
				break;
			}
			
			max=Math.max(max, sum);
			num=sum;
		}
		
		System.out.println(max);
	}

}
