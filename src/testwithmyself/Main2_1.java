package testwithmyself;
/*
 * 
���⣺�������

    ���ŷ���ĳ��Ĺʯ���Ͽ���һ�����֣�13597�����о����֣�

    ����һ��������
    
    ���ң�ȥ����β��������������

    ���ң����м������Ҳ��������

    �������������ֻ�����Щ�أ�ͨ�����³���İ����������ɽ��������ϸ�Ķ����룬����д���߲���ȱʧ�Ĵ��롣

public class A
{
	static boolean isPrime(int n)
	{
		if(n<=1) return false;
		for(int i=2; i*i<=n; i++){
			if(n%i==0) return false;
		}
		return true;
	}
	
	static void f(int[] x, int k)
	{
		if(_____________________________){  // ���λ��
			if(isPrime(x[0]*10000 + x[1]*1000 + x[2]*100 + x[3]*10 + x[4]) &&
				isPrime(x[1]*100 + x[2]*10 + x[3]) &&
				isPrime(x[2]))
				System.out.println(""+x[0]+x[1]+x[2]+x[3]+x[4]);
			return;
		}
		
		for(int i=k; i<x.length; i++){
			{int tmp=x[k]; x[k]=x[i]; x[i]=tmp; }
			f(x,k+1);
			{int tmp=x[k]; x[k]=x[i]; x[i]=tmp; }
		}
	}
	
	static void test()
	{
		int[] x = {1,3,5,7,9};
		f(x,0);
	}
	
	public static void main(String[] args)
	{
		test();
	}
}


    ����������߼������Ʋ⻮�ߴ��Ĵ��룬ͨ����ҳ�ύ��
    ע�⣺����ȱ�ٵĴ�����Ϊ�𰸣�ǧ��Ҫ��д����Ĵ��롢���Ż�˵�����֣���



 * 
 * */
public class Main2_1 {
	static boolean isPrime(int n)
	{
		if(n<=1) return false;
		for(int i=2; i*i<=n; i++){
			if(n%i==0) return false;
		}
		return true;
	}
	
	static void f(int[] x, int k)
	{
		if(k==x.length-1){  // ���λ��
			if(isPrime(x[0]*10000 + x[1]*1000 + x[2]*100 + x[3]*10 + x[4]) &&
				isPrime(x[1]*100 + x[2]*10 + x[3]) &&
				isPrime(x[2]))
				System.out.println(""+x[0]+x[1]+x[2]+x[3]+x[4]);
			return;
		}
		
		for(int i=k; i<x.length; i++){
			{int tmp=x[k]; x[k]=x[i]; x[i]=tmp; }
			f(x,k+1);
			{int tmp=x[k]; x[k]=x[i]; x[i]=tmp; }
		}
	}
	
	static void test()
	{
		int[] x = {1,3,5,7,9};
		f(x,0);
	}
	
	public static void main(String[] args)
	{
		test();
	}
}