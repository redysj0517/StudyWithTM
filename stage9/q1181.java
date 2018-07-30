package stage9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class q1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String arr[] = new String[N];
		HashSet<String> hSet = new HashSet<String>();

		for(int i=0; i<arr.length; i++){
			hSet.add(br.readLine());
		}
		String res[];
		res = new String[hSet.size()];
		hSet.toArray(res);
		Arrays.sort(res);
		Arrays.sort(res, new Comparator<String>() {
			public int compare(String o1, String o2){
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for(String string : res){
			System.out.println(string);
		}
		
	}
}
