package testwithmyself;

public class Main1_1 {
	
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
