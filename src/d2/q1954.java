package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1954 {
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,1,0,-1};
	static int arr[][];
	static boolean visit[][];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++){
			int count = 1;
			int n = Integer.parseInt(br.readLine());
			arr = new int[n][n];
			visit = new boolean[n][n];
			dfs(0,0,count,arr,n);
			
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					bw.write(arr[i][j]+" ");
				}
				bw.write("\n");
			}
		}
		bw.flush();
		
	}
	public static void dfs(int x, int y, int count, int arr[][] ,int n){
		visit[x][y] = true;
		arr[x][y] = count;
		//가로 +
		int nx = x + dx[0];
		int ny = y + dy[0];
		if(nx >= 0 && ny >=0 && nx < n && ny <n){
			if(arr[nx][ny]==0 && !visit[nx][ny]){
				count++;
				dfs(nx,ny,count,arr,n);
			}
		}
		
		//세로+
		nx = x + dx[1];
		ny = y + dy[1];
		if(nx >= 0 && ny >=0 && nx < n && ny <n){
			if(arr[nx][ny]==0 && !visit[nx][ny]){
				count++;
				dfs(nx,ny,count,arr,n);
			}
		}
		//가로 -
		nx = x + dx[2];
		ny = y + dy[2];
		if(nx >= 0 && ny >=0 && nx < n && ny <n){
			if(arr[nx][ny]==0 && !visit[nx][ny]){
				count++;
				dfs(nx,ny,count,arr,n);
			}
		}
		//세로 -
		nx = x + dx[3];
		ny = y + dy[3];
		if(nx >= 0 && ny >=0 && nx < n && ny <n){
			if(arr[nx][ny]==0 && !visit[nx][ny]){
				count++;
				dfs(nx,ny,count,arr,n);
			}
		}
		
		/*
		for(int i=0; i<4; i++){
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny >=0 && nx < n && ny < n ){
				if(arr[nx][ny]==0 && visit[nx][ny]==false){
					count++;
					dfs(nx,ny,count,arr,n);
				}
			}
		}*/
	}
}
