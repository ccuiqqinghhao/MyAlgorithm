package ServernthTestwithMyselfAboutCountry;
/*
 * 
ƽ��ĩβ

�ܹ���ʾΪĳ��������ƽ�������ֳ�Ϊ��ƽ������
���磬25,64
��Ȼ�޷�����˵��ĳ������ƽ���������������Զ϶�ĳ��������ƽ������
��Ϊƽ������ĩλֻ�����ǣ�[0, 1, 4, 5, 6, 9] ��6�������е�ĳ����
���ԣ�4325435332��Ȼ����ƽ������

�������һ��2λ��2λ���ϵ����֣����ܸ���ĩλ����λ���϶�������ƽ������

�����һ�£�һ��2λ���ϵ�ƽ�����������λ�ж����ֿ����ԣ�

ע�⣺��Ҫ�ύ����һ����������ʾ2λ���ϵ�ƽ���������λ�Ĳ�ͬ�������
��Ҫ��д�κζ������ݣ����磬˵���������ֵȣ�

 * */
import java.util.HashSet;
import java.util.Set;

public class Main0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		
		for(int i=4;i<100;i++){
			int num=i*i%100;
			if(!set.contains(num)){
				set.add(num);
			}
			
		}
		
		System.out.println(set.size());
	}

}
