package dfs;

import java.io.IOException;
import java.util.Scanner;

public class q1012 {
	static int T;
	static int M;
	static int N;
	static int K;
	static int arr[][];
	static boolean visit[][];
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	public static void dfs(int x, int y) {
		visit[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && ny>=0 && nx<M && nx<N) {
				if(arr[nx][ny]==1 && visit[nx][ny]==false)
					dfs(nx,ny);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int cnt = 0;
			M = sc.nextInt();
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[M][N];
			visit = new boolean[M][N];
			
			for(int j=0; j<K; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] = 1;
			}
			
			for(int j=0; j<M; j++) {
				for(int k = 0; k<N; k++) {
					if(arr[j][k]==1 && visit[j][k]==false) {
						dfs(j,k);
						cnt++;
					}
				}
			}
			
			
		}
	}
}
