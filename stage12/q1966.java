package stage12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class q1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> que = new LinkedList<Integer>();
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++){
			int count = 0;
			int max = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++){
				int temp = Integer.parseInt(st2.nextToken());
				if(max<temp){ //입력할때 최대값을 집어넣음.
					max = temp;
				}
				que.add(temp);
			}
			while(!que.isEmpty()){
				bw.write(que.poll()+"\n");
			}
		}
		bw.flush();
	}
}
