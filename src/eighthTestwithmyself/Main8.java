package eighthTestwithmyself;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
/*

标题：青蛙跳杯子

    X星球的流行宠物是青蛙，一般有两种颜色：白色和黑色。
    X星球的居民喜欢把它们放在一排茶杯里，这样可以观察它们跳来跳去。
    如下图，有一排杯子，左边的一个是空着的，右边的杯子，每个里边有一只青蛙。

*WWWBBB

    其中，W字母表示白色青蛙，B表示黑色青蛙，*表示空杯子。

    X星的青蛙很有些癖好，它们只做3个动作之一：
    1. 跳到相邻的空杯子里。
    2. 隔着1只其它的青蛙（随便什么颜色）跳到空杯子里。
    3. 隔着2只其它的青蛙（随便什么颜色）跳到空杯子里。

    对于上图的局面，只要1步，就可跳成下图局面：

WWW*BBB

本题的任务就是已知初始局面，询问至少需要几步，才能跳成另一个目标局面。

输入为2行，2个串，表示初始局面和目标局面。
输出要求为一个整数，表示至少需要多少步的青蛙跳。

例如：
输入：
*WWBB
WWBB*

则程序应该输出：
2

再例如，
输入：
WWW*BBB
BBB*WWW

则程序应该输出：
10

我们约定，输入的串的长度不超过15

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
不要使用package语句。不要使用jdk1.7及以上版本的特性。
主类的名字必须是：Main，否则按无效代码处理。

----------------------------

笨笨有话说：
    我梦见自己是一棵大树，
    青蛙跳跃，
    我就发出新的枝条，
    春风拂动那第 5 层的新枝,
    哦，我已是枝繁叶茂。



*/
public class Main8 {
	static String end;
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String start=sc.next();
		 end=sc.next();
		
		LinkedList<Info> list = new LinkedList<>();
		list.add(new Info(start,0));
		f(list);
	}
	//从头上获取
	//把新的加在末尾
	public static void f(LinkedList<Info> list){
		while(!list.isEmpty()){
			Info current = list.remove();
			if(current.now.equals(end)){
				System.out.println(current.count);
				return;
			}
			
			
			if(set.contains(current.now)) continue;
			else set.add(current.now);
			
			
			
			int index=current.now.indexOf('*');
			for(int i=0;i<current.now.length();i++){
				if(current.now.charAt(i)=='*')continue;
				if(Math.abs(i-index)<=3){
					char[] temp=current.now.toCharArray();
					
					char ff = current.now.charAt(i);
					temp[index] = ff;
					temp[i] = '*';
					
					String r = new String(temp);
					list.addLast(new Info(r,current.count+1));
					
				}
			}
		}
	}
}

class Info{
	String now;
	int count;
	public Info(String now,int count){
		this.now=now;
		this.count=count;
	}
}
