package bf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1038_1 {
	public static long cur;
	public static long number;
	public static int N;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		if( N> 1022) {
			number = -1;
		}else if(N>0) {
			getFirst();
		}
		bw.write(number+"");
		bw.flush();
	}
	public static void getFirst() {
		int cnt = 0;
		while(true) {
			for(int i=1; i<=9; i++) {
				getNumber(i, i, cnt);
				if(cur == N)
					return;
			}
			cnt++;
		}
	}
	public static void getNumber(long total, int num, int cnt) {
		if(cnt==0) {
			//몇번 째 호출인지
			//마지막 단계라는 뜻
			cur++;
			if(cur==N) {
				number = total;
				return;
			}
		}else {
			for(int i=0; i<= num - 1; i++) {
				getNumber(total * 10 + i, i, cnt - 1);
				if( cur == N)
					return;
			}
		}
	}
}
