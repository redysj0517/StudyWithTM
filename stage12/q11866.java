package stage12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class q11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Deque<Integer> que = new ArrayDeque<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int temp = Integer.parseInt(st.nextToken());
		int M = temp;
		sb.append("<");
		for (int i = 1; i <= N; i++)
			que.add(i);
		while (!que.isEmpty()) {
			for(int i=0; i<M-1; i++){
				que.addLast(que.removeFirst());
			}
			sb.append(que.removeFirst()+", ");
		}
		System.out.println(sb.toString().substring(0, sb.length()-2) +">");
	}
}
