package stage7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int count = T;
		for(int test_case=0; test_case<T; test_case++){
			String word = br.readLine();
			boolean [] checker = new boolean[26];
			
			for(int i=1; i<word.length(); i++){
				if(word.charAt(i-1) != word.charAt(i)){
					if(checker[word.charAt(i)-97] == true){
						count--;
						break;
					}
					checker[word.charAt(i-1)-97] = true;
				}
			}
		}
		System.out.println(count);
	}
}
