package stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q5430 {
	static Deque<Integer> dq = new LinkedList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- >0){
			dq.clear();
			char arr[] = br.readLine().toCharArray();
			int N = Integer.parseInt(br.readLine());
			String temp = br.readLine();
			temp = temp.substring(1, temp.length()-1);
			StringTokenizer st = new StringTokenizer(temp, ",");
			while(st.hasMoreTokens()){
				dq.add(Integer.parseInt(st.nextToken()));
			}
		}
	}
	public static void R(Deque<Integer> dq){
		for(int i=0; i<dq.size(); i++){
		}
	}
}
