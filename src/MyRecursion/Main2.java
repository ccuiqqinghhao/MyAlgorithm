package MyRecursion;

public class Main2 {
	//�ַ�תȫ����,����̫ǳ�㲻��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		f(data,0);
	}
	static int i=0;
	public static void f(char[] data,int k) {
		if(k==data.length) {
			for(int i=0;i<data.length;i++)
				System.out.print(data[i]+" ");
			System.out.println(i++);
			
		}
		for(int i=k;i<data.length;i++) {
			{char t=data[k];data[k]=data[i];data[i]=t;}
			f(data,k+1);
			{char t=data[k];data[k]=data[i];data[i]=t;}
		}
	}

}
