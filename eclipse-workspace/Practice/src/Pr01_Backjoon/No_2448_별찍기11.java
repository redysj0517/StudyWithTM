package Pr01_Backjoon;
import java.util.*;
public class No_2448_별찍기11 {

	int inputInt() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		return num;
	}

	String[][] starArr(int Low, int Cal){
		String[][] star = new String[Low][Cal];
		
		for(int i = star.length-1; i>=0;i--) {
			for(int j = 0 ; j<star[i].length;j++) {
				star[i][j]=" ";
			}
		}
		
		for(int i = Low-1; i>=0; i--) {
			
			for(int j = i; j<=Cal-2-i; j++) {
				star[i][j]="*";
			}
			
			
		}
		

		return star;
	}
	
	String[][] eraseStar(String[][] star,int LowUp,int LowDown, int CalUp,int CalDown){
		
		int k=0;
		
		for(int i = LowUp-1; i>=LowDown;i--) {
			for(int j = CalDown+k; j<CalUp-k-1;j++) {
				star[i][j]=" ";
			}
			k++;	
		}
		return star;
		
		
	}
	void printing(String[][] star) {
		for(int i = star.length-1; i>=0;i--) {
			for(int j = 0 ; j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void main(String[] args) {
		No_2448_별찍기11 ob = new No_2448_별찍기11();
		int num = ob.inputInt();
		int Low =num, Cal = num*2;
		
		String[][] star = new String[Low][Cal];
		star = ob.starArr(Low,Cal);
		
		
		
		
		star = ob.eraseStar(star,12,0,36,12);
		
		star = ob.eraseStar(star,6,0,18,6);
		star = ob.eraseStar(star,6,0,42,30);
		star = ob.eraseStar(star,18,12,30,18);
		
		
		ob.printing(star);
		
		}
		
}
