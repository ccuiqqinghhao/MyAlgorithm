package thirtyninetaijie;

public class Main {
	static int num=0;//����
	static int foot=0;//����,�������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f(0);
		System.out.println(num);
	}
	public static void f(int t){
		if(t==39){
			if(foot%2==0){
				num++;
			}
		}else{
			foot++;
			f(t+1);
			foot--;
			
			if(t<=37){
				foot++;
				f(t+2);
				foot--;
			}
		}
	}
	//ż��Ϊ��,����Ϊ��
	/*public static void f(int t){
		if(t==39)
			if(foot%2==0)num++;
		else{
			foot++;
			f(t+1);
			foot--;
			
			if(t<=37){//������
				foot++;
				f(t+2);
				foot--;
			}
		}
	}*/
}
