package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * D1.2043 서랍의 비밀번호
 * 그냥 1씩증가시켜서 하나씩 다 돌려보는것이기 때문에 두 값을 뺀 후에 1을 더하면됨.
 */
public class q2043 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(a-b+1 +"\n");
		bw.flush();
	}
}
