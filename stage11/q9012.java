package stage11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class q9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int testcase = 0; testcase <T; testcase++){
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			String aa = st.nextToken();
			char temp[] = aa.toCharArray();
			
			for(int i=0; i<temp.length; i++){
				if(temp[i]=='('){
					linkedList.push(1);
				}else{
					if(linkedList.size()==0){
						linkedList.push(1);
						break;
					}
					linkedList.pop();
				}
			}
			if(linkedList.isEmpty())//empty¸é true
				bw.write("YES" + "\n");
			else
				bw.write("NO" +  "\n");
		}
		bw.flush();
	}
}
