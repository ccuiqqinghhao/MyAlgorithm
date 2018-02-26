package AboutFloat;

public class main0 {
//º£µÁ±ÈÆ´¾ÆÁ¿
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=20;a>=1;a--)
		for(int b=a-1;b>=1;b--)
		for(int c=b-1;c>=1;c--)
		for(int d=c-1;d>=1;d--)
			if(Math.abs((1.0/a+1.0/b+1.0/c+1.0/d)-1)<10E-10)
				System.out.println(a+","+b+","+c+","+d+","+0);
						
	}
				
			
		
	
}
 