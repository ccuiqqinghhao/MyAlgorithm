package ServernthTestwithMyselfAboutCountry;
/*
 * 
路径之谜

小明冒充X星球的骑士，进入了一个奇怪的城堡。
城堡里边什么都没有，只有方形石头铺成的地面。

假设城堡地面是 n x n 个方格。【如图1.png】所示。

按习俗，骑士要从西北角走到东南角。
可以横向或纵向移动，但不能斜着走，也不能跳跃。
每走到一个新方格，就要向正北方和正西方各射一箭。
（城堡的西墙和北墙内各有 n 个靶子）


同一个方格只允许经过一次。但不必做完所有的方格。

如果只给出靶子上箭的数目，你能推断出骑士的行走路线吗？

有时是可以的，比如图1.png中的例子。

本题的要求就是已知箭靶数字，求骑士的行走路径（测试数据保证路径唯一）

输入：
第一行一个整数N(0<N<20)，表示地面有 N x N 个方格
第二行N个整数，空格分开，表示北边的箭靶上的数字（自西向东）
第三行N个整数，空格分开，表示西边的箭靶上的数字（自北向南）

输出：
一行若干个整数，表示骑士路径。

为了方便表示，我们约定每个小格子用一个数字代表，从西北角开始编号: 0,1,2,3....
比如，图1.png中的方块编号为：

0  1  2  3
4  5  6  7
8  9  10 11
12 13 14 15


示例：
用户输入：
4
2 4 3 4
4 3 3 3

程序应该输出：
0 4 5 1 2 3 7 11 10 9 13 14 15



资源约定：
峰值内存消耗 < 256M
CPU消耗  < 1000ms


请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

所有代码放在同一个源文件中，调试通过后，拷贝提交该源码。
注意：不要使用package语句。不要使用jdk1.7及以上版本的特性。
注意：主类的名字必须是：Main，否则按无效代码处理。



 * 
 * 
 * */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4_1 {
	static int n;
	static int north[];
	static int west[];
	static int[][] map;
	static int[] load;
	static int northSum=0;
	static int westSum=0;
	static int bushu=1;// x y   x y   x  y    x y
	static int[][] four={{0,1},{1,0},{0,-1},{-1,0}};//右 下 左 上
	
	
	
	
	public static void f(int x,int y){
		if(x==n-1&&y==n-1){
			if(westSum==0&&northSum==0){
				for(int i=0;i<bushu;i++)
					System.out.print(load[i]+" ");
			}
		}
		
		for(int i=0;i<4;i++){
			int dx=x+four[i][0];
			int dy=y+four[i][1];
			if(dx>=0&&dx<n&&dy>=0&&dy<n&&north[dy]>0&&west[dx]>0&&map[dx][dy]!=-1){
				west[dx]--;
				westSum--;
				north[dy]--;
				northSum--;
				load[bushu]=map[dx][dy];
				bushu++;
				f(dx,dy);
				bushu--;
				west[dx]++;
				westSum++;
				north[dy]++;
				northSum++;
				
			}
		}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		north=new int[n];
		west=new int[n];
		map=new int[n][n];
		load=new int[n*n];
		int temp=0;
		for(int i=0;i<map.length;i++)
			for(int j=0;j<map[i].length;j++)
				map[i][j]=temp++;
		for(int i=0;i<north.length;i++){
			north[i]=in.nextInt();
			northSum+=north[i];
		}
		for(int i=0;i<west.length;i++){
			west[i]=in.nextInt();
			westSum+=north[i];
		}
		north[0]--;
		northSum--;
		west[0]--;
		westSum--;
		map[0][0]=-1;
		load[0]=0;
		f(0,0);
		
		
	}
	
}

