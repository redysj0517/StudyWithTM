package dfs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q2178 {
	static int max = 0;
	static int N;
	static int M;
	static int arr[][];
	static boolean visit[][];
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, -1, 0, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[100][100];
		visit = new boolean[100][100];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
				visit[i][j] = false;
			}
		}
		visit[0][0] = true;
		BFS(0, 0);
		bw.write(arr[N - 1][M - 1] + "");
		bw.flush();
	}

	public static void BFS(int x, int y) {
		Queue<TM> q = new LinkedList<TM>();
		q.add(new TM(x, y));

		while (!q.isEmpty()) {
			TM d = q.poll();

			for (int i = 0; i < 4; i++) {
				int nx = d.x + dx[i];
				int ny = d.y + dy[i];

				if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
					if (arr[nx][ny] == 1 && visit[nx][ny] == false) {
						q.add(new TM(nx, ny));
						arr[nx][ny] = arr[d.x][d.y]+1;
						visit[nx][ny] = true;
					}
				}
				/*
				if(nx<0 || ny <0 || nx>=N || ny >=M) {
					continue;
				}
				if(visit[nx][ny]|| arr[nx][ny]==0) {
					continue;
				}
				q.add(new TM(nx,ny));
				arr[nx][ny] = arr[d.x][d.y] +1;
				visit[nx][ny] = true;*/
			}
		}
	}
}

class TM {
	int x;
	int y;

	TM(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
