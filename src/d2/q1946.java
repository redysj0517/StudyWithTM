package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			int count = 0;
			int N = Integer.parseInt(br.readLine());
			bw.write("#" + tc + "\n");
			for (int nn = 0; nn < N; nn++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String tm = st.nextToken();
				int m = Integer.parseInt(st.nextToken());
				
				for(int i=0; i<m; i++){
					if(count==10){
						bw.write(""+"\n");
						count = 0;
					}
					bw.write(tm);
					count++;
				}
			}
			bw.write("\n");
			bw.flush();
		}
	}
}
