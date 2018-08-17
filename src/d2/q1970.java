package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 반복문을 돌면서 큰수부터 하나씩 빼면서 카운트 수를 늘린다.
 * 
 */
public class q1970 {
	static int arr[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	static int count[] = new int[8];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<count.length; i++)
				count[i] = 0;
			
			for (int i = 0; i < 8; i++) {
				while (n >= arr[i]) {
					if (n / arr[i] > 0) {
						n -= arr[i];
						count[i]++;
					}
				}
			}
			bw.write("#"+tc+"\n");
			for(int i=0; i<8; i++){
				bw.write(count[i]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
	}
}
