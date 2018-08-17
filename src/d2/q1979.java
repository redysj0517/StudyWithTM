package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class q1979 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc =1; tc<=T; tc++){
			String str[] = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int K = Integer.parseInt(str[1]);
			int arr[][] = new int[N][N];
			for(int i=0; i<N; i++){
				str = br.readLine().split(" ");
				for(int j=0; j<N; j++){
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}
			int answer = 0;
			for(int i=0; i<N; i++){
				int count = 0;
				int j=0;
				while(true){
					if(arr[i][j]==1){
						if(count ==K)
							answer++;
						count = 0;
						j++;
					}else{
						count++;
						j++;
					}
					if(j==N){
						if(count==K)
							answer++;
						break;
					}
				}
			}
			
			//세로체크
			for(int i=0; i<N; i++){
				int count = 0;
				int j=0;
				while(true){
					if(arr[i][j]==1){
						if(count==K)
							answer++;
						count=0;
						j++;
					}else{
						count++;
						j++;
					}
					if(j==N){
						if(count==K)
							answer++;
						break;
					}
				}
			}
			bw.write("#"+tc+" "+answer+"\n");
		}
		bw.flush();
	}
}
