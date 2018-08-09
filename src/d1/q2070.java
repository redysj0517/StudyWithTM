package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q2070 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase =1; testcase <= T; testcase++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a>b){
				bw.write("#"+testcase+" >"+"\n");
			}else if(a<b){
				bw.write("#"+testcase+" <"+"\n");
			}else{
				bw.write("#"+testcase+" ="+"\n");
			}
		}
		bw.flush();
	}
}
