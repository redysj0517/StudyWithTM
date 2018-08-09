package d1;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/*
 * 평균값 구하기
 */
public class q2071 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase=1; testcase <= T; testcase++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double sum = 0;
			while(st.hasMoreTokens()){
				sum += Integer.parseInt(st.nextToken());
			}
			bw.write("#" + testcase + " " + Math.round(sum/10) +"\n");
			
		}
		bw.flush();
	}
}
