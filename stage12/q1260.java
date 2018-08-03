package stage12;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q1260 {
	
	static int[][] map; //2���� �������
	static boolean visited[]; // �湮������ ��Ÿ���� ���� ���
	static int N; //������ ����
	static int E; //������ ����
	static int startPoint;
	
	public static void dfs(int i){
		visited[i] = true;
		System.out.print(i + " ");
		
		for(int j=1; j<=N; j++){
			if(map[i][j]==1 && visited[j]==false){
				dfs(j);
			}
		}
	}
	
	public static void bfs(int i){
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(i);
		visited[i] = true;
		System.out.print(i + " ");
		
		int temp;
		while(!q.isEmpty()){
			temp = q.poll();
			for(int j=0; j<N+1; j++){
				if(map[temp][j]==1 && visited[j]==false){
					q.offer(j);
					visited[j]=true;
					System.out.print(j + " ");
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		E = sc.nextInt();
		startPoint = sc.nextInt();
		map = new int[1001][1001];
		visited = new boolean[10001];
		int a, b;
		
		for(int i=1; i<=E; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		
		dfs(startPoint);
		
		for(int j=1; j<=N; j++){
			visited[j] = false;
		}
		System.out.println();
		bfs(startPoint);
	}
	
}
