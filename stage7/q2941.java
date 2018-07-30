package stage7;

import java.io.IOException;
import java.util.Scanner;

public class q2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		
		String [] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i=0; i<8; i++){
			t= t.replace(croatia[i], "a");
		}
		System.out.println(t.length());
	}		
}