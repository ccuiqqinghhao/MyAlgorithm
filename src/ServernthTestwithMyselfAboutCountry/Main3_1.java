package ServernthTestwithMyselfAboutCountry;
/////凉凉
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main3_1 {
	public static void main(String...da){	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] map = new int[n];
		for(int i=0;i<map.length;i++){
			map[i] = in.nextInt();
		}
		//-------------------------------------
		
		//int startIndex = 0;
		int maxResult = Integer.MIN_VALUE;
		int result = 0;
		for(int i=0;i<n;i++){
			int[] temp = Arrays.copyOfRange(map, 0, n);//复制一份
			int cur_index = i;//当前开始下标
			int laji = 0;
			int cur_count = 1;
			result = 0;
			while(true){
				if(cur_count > 120){
					break;
				}else{
					if(temp[cur_index] == -1) {
						laji++;
						if(laji > 1000){
							break;
						}else{
							cur_index++;
							cur_index = cur_index % n;
						}
						continue;
					}
					if(cur_count == temp[cur_index]){
						result += temp[cur_index];//累加结果
						cur_count = 1;//重新数数
						temp[cur_index] = -1;//拿走牌
						cur_index++;
						cur_index = cur_index % n;
					}else{//不等于
						cur_count++;
						cur_index++;
						cur_index = cur_index % n;
					}
				}
			}
			maxResult = Math.max(maxResult, result);
		}
		System.out.println(maxResult);
	}

}
