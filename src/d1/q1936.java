package d1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * D1.1936 1대1 가위바위보
 * 가위는 1 바위는2 보는 3 
 */
public class q1936 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(a == 1){
			if(b==2){
				bw.write("B");
			}else{
				bw.write("A");
			}
		}else if(a==2){
			if(b==1){
				bw.write("A");
			}else{
				bw.write("B");
			}
		}else if(a==3){
			if(b==1){
				bw.write("B");
			}else{
				bw.write("A");
			}
		}
		bw.flush();
	}
}
