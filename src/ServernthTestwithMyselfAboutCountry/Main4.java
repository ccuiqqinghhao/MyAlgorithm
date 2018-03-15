package ServernthTestwithMyselfAboutCountry;

import java.util.Scanner;

public class Main4 {
	  static int[] row ;//���汱�߰����ϵ���Ŀ
	    static int[] col; //�������߰��ӵ���Ŀ
	    static int[][] vis ; // ������飬����Թ��ķ����Ƿ��߹�
	    static int N; 
	    //���������ĸ�����
	    static int[][] location = {{0,1},{1,0},{0,-1},{-1,0}};
	    //ת����0--N^2-1�����飬���Ҫ�� 
	    static int[][] print;
	    static int rowSum = 0;//���߰��ӵ�����Ŀ
	    static int colSum = 0;//���߰��ӵ�����Ŀ
	    static int[] map = null; //����Ҫ�������·��
	    static int aLen =1; //����·���ĳ���
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        N = sc.nextInt();
	        //��ʼ������
	        row = new int[N];
	        col = new int[N];
	        vis = new int[N][N];
	        print = new int[N][N];
	        map = new int[N*N+1];
	        int index = 0;
	        for(int i=0; i<N; ++i)
	            for(int j=0; j<N; ++j)
	                print[i][j] = index++;
	        //��������
	        for(int i=0; i<N; ++i){
	            row[i] = sc.nextInt();
	            rowSum += row[i];
	        }
	        for(int i=0; i<N; ++i){
	            col[i] = sc.nextInt();
	            colSum += col[i];
	        }
	        //��ʼ����
	        row[0]--;
	        rowSum--;
	        col[0]--;
	        colSum--;
	        vis[0][0] = 1;
	        map[0] = 0;
	        //��0,0����
	        dfs(0,0);
	    }

	    public static void dfs(int x, int y){
	        if(x==N-1 && y==N-1){
	            //��ӡ���
	            if(rowSum==0 && colSum==0){
	                for(int i=0; i<aLen; ++i)
	                    System.out.print(map[i]+" ");
	            }
	        }
	        for(int i=0; i<4; ++i){
	            int dx = x + location[i][0];
	            int dy = y + location[i][1];
	            //1.û���磬2.�����ϵİ�����Ŀ����Ϊ1
	            if (dx >= 0 && dx < N && dy >= 0 && dy < N && vis[dx][dy] == 0 && row[dy] > 0 && col[dx] > 0) {
	                vis[dx][dy] = 1;
	                row[dy]--;
	                rowSum--;
	                col[dx]--;
	                colSum--;
	                map[aLen++] = print[dx][dy];
	                dfs(dx, dy);
	                aLen--; //�߲�ͨ��ֱ�ӽ�map�����aLen--
	                vis[dx][dy] = 0;
	                row[dy]++;
	                rowSum++;
	                col[dx]++;
	                colSum++;
	            }
	        }
	    }
}
