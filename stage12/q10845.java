package stage12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Queue<Integer> que = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int last = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String A = st.nextToken();
			if (A.equals("push")) {
				int B = Integer.parseInt(st.nextToken());
				que.add(B);
				last = B;
			} else if (A.equals("front")) {
				if (que.isEmpty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(que.peek() + "\n");
				}
			} else if (A.equals("back")) {
				if (que.isEmpty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(last + "\n");
				}
			} else if (A.equals("size")) {
				bw.write(que.size() + "\n");
			} else if (A.equals("empty")) {
				if (que.isEmpty()) {
					bw.write(1 + "\n");
				} else {
					bw.write(0 + "\n");
				}
			} else if (A.equals("pop")) {
				if (que.isEmpty()) {
					bw.write(-1 + "\n");
				} else {
					bw.write(que.poll() + "\n");
				}
			}
		}
		bw.flush();
	}
}
