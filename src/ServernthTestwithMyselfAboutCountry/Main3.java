package ServernthTestwithMyselfAboutCountry;

import java.util.Scanner;

public class Main3 {
	public static int n;
	public static int max = 0;
	public static int[] value;

	public static void getResult() {
		for (int i = 0; i < n; i++) {
			int[] temp = new int[n];
			for (int k = 0; k < n; k++)
				temp[k] = value[k];

			int sum = 0;
			int count = 1;
			int start = i;
			while (true) {
				boolean judge = true;
				for (int k = 0; k < n; k++)
					if (temp[k] >= count) {// 从count开始数,从start个元素开始数
						judge = false;
						break;
					}
				if (judge)
					break;
				int j = start % n;
				if (temp[j] == count) {
					sum = sum + count;
					temp[j] = -1;
					count = 1;
				} else if (temp[j] != -1)
					count++;
				start++;
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		value = new int[n];
		for (int i = 0; i < n; i++)
			value[i] = in.nextInt();
		getResult();
	}
}
