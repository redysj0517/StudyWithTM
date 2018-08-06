package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
 * 처음에 당연히 큰숫자 그담에 젤 작은 숫자.. 이런식으로 수를 셋팅하고 식을 완성하면 큰 값이 나올거라 생각했는데 그게 아닌가봄..
 * 결국 완전탐색(brute force)로 모든 순열을 구하고 그 값의 최대값을 출력..
 */
public class q10819 {
	public static int res = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> A = new ArrayList<Integer>();
		int arr[] = new int[n]; //입력받은 배열
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //일단 정렬을 통해 오름차순으로 만들어 놓음.
		boolean Acheck[] = new boolean[n]; //돌면서 flag를 통해 확인여부만체크
		
		soon(n, A, Acheck, arr); //순열함수
		
		bw.write(res+"\n");
		bw.flush();
		
	}
	public static void soon(int n, ArrayList<Integer> A, boolean Acheck[] , int arr[]){
		if(A.size() == n){
			int sum = addsum(A);
			if(sum > res){
				res = sum;
			}
			return;
		}
		for(int i=0; i<n; i++){
			if(Acheck[i])
				continue;
			Acheck[i] = true;
			A.add(arr[i]);
			soon(n, A, Acheck, arr);
			A.remove(A.size()-1);
			Acheck[i] = false;
		}
	}
	public static int addsum(ArrayList<Integer> A){
		int sum = 0;
		for(int i=1; i<A.size(); i++){
			sum+= Math.abs(A.get(i)- A.get(i-1));
		}
		return sum;
	}
}
