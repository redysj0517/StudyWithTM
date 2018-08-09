package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * D1.2029 몫과 나머지 출력하기
 * 2개의 수 a,b를 입력받아 나눈 몫과 나머지를 출력하기.
 */
public class q2029 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int testcase=1; testcase<=T; testcase++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write("#"+testcase+" "+a/b+" "+a%b+"\n");
		}
		bw.flush();
	}
}
