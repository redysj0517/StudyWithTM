package stage11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q10828 {
	LinkedList<Integer> stack = new LinkedList<Integer>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> stack = new LinkedList<Integer>();
		
		while(N>0){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String A = st.nextToken();
			
			if(A.equals("push")){
				int B = Integer.parseInt(st.nextToken());
				stack.push(B);
			}else if(A.equals("pop")){
				if(stack.isEmpty()){
					bw.write(-1 + "\n");
				}else{
					bw.write(stack.pop() + "\n");
				}
			}else if(A.equals("size")){
				bw.write(stack.size()+"\n");
			}else if(A.equals("empty")){
				if(stack.isEmpty()){
					bw.write(1 + "\n");
				}else{
					bw.write(0 + "\n");
				}
			}else if(A.equals("top")){
				if(stack.isEmpty()){
					bw.write(-1 + "\n");
				}else{
					int temp = stack.pop();
					bw.write(temp +"\n");
					stack.push(temp);
				}
			}
			N--;
		}
		bw.flush();
	}
}
