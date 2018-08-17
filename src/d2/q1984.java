package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
 * 10개를 입력받아 최대 수와 최소수를 제외한 나머지 평균값 출력
 */
public class q1984 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<=T; tc++){
			int arr[] = new int[10];
			String str[] = br.readLine().split(" ");
			for(int i=0; i<10; i++){
				arr[i] = Integer.parseInt(str[i]);
			}
			Arrays.sort(arr);
			arr[0] = 0;
			arr[arr.length-1] = 0;
			double res = 0;
			for(int i=0; i<arr.length; i++)
				res += arr[i];
			bw.write("#"+tc+" "+ Math.round(res/8)+"\n");
		}
		bw.flush();
	}
}
