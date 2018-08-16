package dfs;

import java.util.Scanner;

/*
 * 인접행렬을 dfs로 구현해보기
 */
public class DFS {
	static int nE;
	static int nV;
	static int arr[][];
	static boolean visit[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		nV = sc.nextInt();
		nE = sc.nextInt();
		arr = new int[nV+1][nV+1];
		visit  = new boolean[nV+1];
		
		for(int i=0; i<nE+1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[a][b] = arr[b][a] = 1;
		}
		dfs(1);
	}
	public static void dfs(int n) {
		visit[n] = true;
		System.out.println(n+" ");
		for(int i=1; i<nE+1; i++) {
			if(arr[n][i] == 1 && visit[i]==false) {
				dfs(i);
			}
			
			
		}
		
	}

}
