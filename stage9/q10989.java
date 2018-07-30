package stage9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class q10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		
		int arr[] = new int[N];
		for(int i=0; i<arr.length; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}
		//모든 수는 10000보다 작거나 같은 자연수
		int countData[] = new int[10000000];
		for(int i=0; i<arr.length; i++){
			countData[arr[i]]++;
		}
		
		for(int i=1; i<countData.length; i++){
			countData[i] = countData[i-1]+countData[i];
		}
		
		int [] sortedData =new int[arr.length];
		for(int i=arr.length-1; i>=0; i--){
			sortedData[countData[arr[i]] -1] = arr[i];
			countData[arr[i]]--;
		}
		for(int i=0; i<sortedData.length; i++){
			bw.write(sortedData[i] + "\n");
		}
		bw.flush();
	}
}
