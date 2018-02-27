package MyRecursion;

public class Main2 {
	//字符转全排列,道行太浅搞不懂
	static char[] data="ABC".toCharArray();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] data="ABC".toCharArray();
		//f(data,0);
		f(0);
	}
	public static void change(int a,int b){
		char temp=data[a];
		data[a]=data[b];
		data[b]=temp;
	}
	public static void f(int k){
		if(k==data.length){
			for(int i=0;i<data.length;i++)
				System.out.print(data[i]+" ");
			System.out.println();
		}
		for(int i=k;i<data.length;i++){
			change(i,k);
			f(k+1);
			change(i,k);
		}
	}
/*	static int i=0;
	public static void f(char[] data,int k) {
		if(k==data.length) {
			for(int i=0;i<data.length;i++)
				System.out.print(data[i]+" ");
			System.out.println();
			
		}
		for(int i=k;i<data.length;i++) {
			{char t=data[k];data[k]=data[i];data[i]=t;}
			f(data,k+1);
			{char t=data[k];data[k]=data[i];data[i]=t;}
		}
	}*/

}
