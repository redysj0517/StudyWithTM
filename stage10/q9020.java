package stage10;

import java.util.Scanner;

public class q9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean [] res = new boolean[10001];
		
		for(int i=2; i<Math.sqrt(10000); i++){
			if(!res[i]){
				for(int j=2; i*j<=10000; j++){
					res[i*j] = true;
				}
			}
		}
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			int n = sc.nextInt();
			n/=2;
			int diff = 0;
			while(true){
				if(!res[n-diff] && !res[n+diff]){
					System.out.println((n-diff)+ " " + (n+diff));
					break;
				}
				diff++;
			}
		}
	}
}
