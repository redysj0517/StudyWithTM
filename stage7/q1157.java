package stage7;

import java.util.Scanner;

public class q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		String s = sc.nextLine();
		s = s.toLowerCase();
		char text[] = s.toCharArray();
		int[] count = new int[26];
		for(int i=0; i<text.length; i++){
			count[text[i]-97]++;
		}
		int max = 0, num = 0;
		for(int i=0; i<count.length; i++){
			if(max<count[i]){
				max = count[i];
				num = i;
			}
		}
		for(int i=0; i<count.length; i++){
			for(int j=0; j<count.length; j++){
				if(count[i] == max && count[j]==max && i!=j){
					flag = true;
				}
			}
		}
		if(flag)
			System.out.println("?");
		else{
			char ans = (char)(num+65);
			System.out.println(ans);
		}
	}
}
