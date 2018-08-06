package stage13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q10866 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> dque = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("push_front")){
				int temp = Integer.parseInt(st.nextToken());
				dque.addFirst(temp);
			}else if(command.equals("push_back")){
				int temp = Integer.parseInt(st.nextToken());
				dque.addLast(temp);
			}else if(command.equals("pop_front")){
				if(dque.isEmpty()){
					bw.write(-1 + "\n");
				}else{
					bw.write(dque.pollFirst()+ "\n");
				}
			}else if(command.equals("pop_back")){
				if(dque.isEmpty()){
					bw.write(-1 + "\n");
				}else{
					bw.write(dque.pollLast() + "\n");
				}
			}else if(command.equals("size")){
				bw.write(dque.size() + "\n");
			}else if(command.equals("empty")){
				if(dque.isEmpty()){
					bw.write(1 + "\n");
				}else{
					bw.write(0 + "\n");
				}
			}else if(command.equals("front")){
				if(dque.isEmpty()){
					bw.write(-1 + "\n");
				}else{
					bw.write(dque.peekFirst()+ "\n");
				}
			}else if(command.equals("back")){
				if(dque.isEmpty()){
					bw.write(-1 + "\n");
				}else{
					bw.write(dque.peekLast() + "\n");
				}
			}
		}
		bw.flush();
	}
}
