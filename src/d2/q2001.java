package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 파리퇴치
 * 완전탐색!
 */
public class q2001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <=T; tc++){
			String str[] = br.readLine().split(" ");
			int N  = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			int arr[][] = new int [N][N];
			int max = 0;
			int temp = 0;
			for(int i=0; i<N; i++){
				str = br.readLine().split(" ");
				for(int j=0; j<N; j++){
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			for(int i=0; i<N-M+1; i++){
				for(int j=0; j<N-M+1; j++){
					temp = paricha(i,j,M,arr);
					if(temp>max){
						max = temp;
					}
				}
			}
			bw.write("#"+tc+" "+ max+"\n");
		}
		bw.flush();
	}
	public static int paricha(int a, int b, int M,int arr[][]){
		int temp =0;
		for(int i=a; i<a+M; i++){
			for(int j=b; j<b+M; j++){
				temp+=arr[i][j];
			}
		}
		return temp;
	}
}
