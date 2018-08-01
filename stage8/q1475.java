package stage8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1475 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String to = br.readLine();
		char[] arr = to.toCharArray();
		char set[] = {'0','1','2','3','4','5','6','7','8','9'};
		int temp[] = new int[10];
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<set.length; j++){
				if(set[j]==arr[i])
					temp[j]++;
			}
		}
		temp[6] = temp[6]+temp[9];
		temp[9] = 0;
		if(temp[6]%2==1){
			temp[6] = temp[6]/2 + 1;
		}else{
			temp[6] = temp[6]/2;
		}
		int max = 0;
		for(int i=0; i<temp.length; i++){
			if(max<temp[i])
				max = temp[i];
		}
		System.out.println(max);
	}
}
