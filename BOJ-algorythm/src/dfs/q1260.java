package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
 * DFS¿Í BFS
 */
public class q1260 {
	static int n;
	static int m;
	static int v;
	static int arr[][];
	static boolean visit[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		v = Integer.parseInt(str[2]);
		arr = new int[1001][1001];
		visit = new boolean [10001];
		for(int i=0; i<m; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			arr[x][y] = arr[y][x] = 1;
		}
		DFS(v);
		System.out.println("");
		for(int j=0; j<=n; j++) {
			visit[j] = false;
		}
		BFS(v);
	}
	public static void DFS(int g) {
		visit[g] = true;
		System.out.print(g+" ");
		for(int i = 1; i<n+1; i++) {
			if(visit[i]==false && arr[g][i] == 1) {
				DFS(i);
			}
		}
	}
	public static void BFS(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visit[i] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp+" ");
			
			for(int j=1; j<m+1; j++) {
				if(arr[temp][j] == 1 && visit[j] == false) {
					q.offer(j);
					visit[j] = true;
				}
			}
		}
	}
}
