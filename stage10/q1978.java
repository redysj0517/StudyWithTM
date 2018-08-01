package stage10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = 0;
		while (st.hasMoreTokens()) {
			int temp = Integer.parseInt(st.nextToken());
			int flag_count = 0;
			
			for(int i=1; i<=temp; i++){
				if( temp%i==0) // 나머지가0이면 소수가 아님.
					flag_count++;
			}
			if(flag_count==2) //1과 자기자신만 해서 2일때만 소수로 인정
				count++;
		}
		bw.write(count+"\n");
		bw.flush();
	}
}
