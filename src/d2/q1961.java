package d2;

import java.util.Scanner;

public class q1961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++){
			int N = sc.nextInt();
			int arr[][] = new int[N][N];
			String line[] = new String[N];
			
			for(int i=0; i<N;i++){
				line[i] = "";
			}
			for(int i=0; i<N; i++){
				for(int j=0; j<N; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int j=N-1; j>=0; j--){
				for(int i=N-1; i>=0; i--){
					line[j] += arr[i][j];
				}
			}
			
			for(int i=0; i<N; i++)
				line[i] += " ";
			
			
			for(int i=N-1; i>=0; i--){
				for(int j=N-1; j>=0; j--){
					line[N-i-1] += arr[i][j];
				}
			}
			
			for(int i=0; i<N; i++)
				line[i] += " ";
			
			
			for(int j=N-1; j>=0; j--){
				for(int i=0; i<N; i++){
					line[N-j-1] += arr[i][j];
				}
			}
			System.out.println("#"+tc);
			for(int i=0; i<N; i++){
				System.out.print(line[i]+"\n");
			}
		}
	}
}
