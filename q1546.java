package stage4;

import java.io.IOException;
import java.util.Scanner;

public class q1546 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		double new_arr[] = new double[N];
		double max = 0;
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
			if(arr[i]>max)
				max = arr[i];
		}
		double result = 0;
		for(int i=0; i<arr.length; i++){
			new_arr[i] = (arr[i]/max)*100;
			result += new_arr[i];
		}
		System.out.printf("%.2f", result/N);
		
		sc.close();
	}
}
