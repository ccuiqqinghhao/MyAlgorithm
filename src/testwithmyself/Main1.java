package testwithmyself;

public class Main1 {
	/*
	 * 
	 * 
	 * 
	 * 
标题：埃及分数

    古埃及曾经创造出灿烂的人类文明，他们的分数表示却很令人不解。古埃及喜欢把一个分数分解为类似： 1/a + 1/b 的格式。

    这里，a 和 b 必须是不同的两个整数，分子必须为 1

    比如，2/15 一共有 4 种不同的分解法（姑且称为埃及分解法）：

1/8 + 1/120
1/9 + 1/45
1/10 + 1/30
1/12 + 1/20


    那么， 2/45 一共有多少个不同的埃及分解呢（满足加法交换律的算同种分解）？ 请直接提交该整数（千万不要提交详细的分解式！）。

    请严格按照要求，通过浏览器提交答案。
    注意：只提交分解的种类数，不要写其它附加内容，比如：说明性的文字*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=2;
		int num2=45;
		int count=0;
		for(int i=2;i<num2;i++){
			for(int j=46;j<45*45;j++){
				int x=i+j;
				int y=i*j;
				if(y*2==x*45){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}
