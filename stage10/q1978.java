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
				if( temp%i==0) // ��������0�̸� �Ҽ��� �ƴ�.
					flag_count++;
			}
			if(flag_count==2) //1�� �ڱ��ڽŸ� �ؼ� 2�϶��� �Ҽ��� ����
				count++;
		}
		bw.write(count+"\n");
		bw.flush();
	}
}
