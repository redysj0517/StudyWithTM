package stage7;

import java.util.Scanner;

public class q5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int sum  = 0;
		
		for(int i=0; i<a.length(); i++){
			char charIndex = a.charAt(i);
			if(charIndex >= 'A' && charIndex <= 'C'){
				sum += 3;
			}else if(charIndex >= 'D' && charIndex <='F'){
				sum += 4;
			}else if(charIndex >= 'G' && charIndex <='I'){
				sum += 5;
			}else if(charIndex >= 'J' && charIndex <='L'){
				sum += 6;
			}else if(charIndex >= 'M' && charIndex <='O'){
				sum += 7;
			}else if(charIndex >= 'P' && charIndex <='S'){
				sum += 8;
			}else if(charIndex >= 'T' && charIndex <='V'){
				sum += 9;
			}else if(charIndex >= 'W' && charIndex <='Z'){
				sum += 10;
			}
		}
		System.out.println(sum);
		
		sc.close();
	}
}
