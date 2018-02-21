package MyRecursion;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,56,1,1,3,4,8,6};
		System.out.println(fb(a,0));
		System.out.println(fm(a,0,a.length-1));
		System.out.println(fe(a,a.length-1));
	}
	//递归求数组各项和,踢皮球[.[......]]
	public static int fb(int[] a,int begin) {
		if(begin==a.length)return 0;
		int x=fb(a,begin+1);
		return x+a[begin];
	}
	//递归求数组各项和,踢皮球[[......].]
	public static int fe(int[] a,int end) {
		if(end<0)return 0;
		int x=fe(a,end-1);
		return x+a[end];
	}
	//递归求数组各项和,从中间分
	public static int fm(int[] a,int begin,int end) {
		if(begin!=end) {
			int x=fm(a,begin,(begin+end)/2);
			int y=fm(a,(begin+end)/2+1,end);
			return x+y;
		}
		return a[begin];
	}
}
