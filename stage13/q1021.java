package stage13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q1021 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		LinkedList<Integer> q = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		while(N-- > 0){
			q.add(Integer.parseInt(st.nextToken()));
		}
		System.out.println(findC(M,N,q));
	}
	public static int findC(int M, int N, LinkedList<Integer> q){
		int cnt = 0;
		return cnt;
	}
}
















