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
 * ó���� �翬�� ū���� �״㿡 �� ���� ����.. �̷������� ���� �����ϰ� ���� �ϼ��ϸ� ū ���� ���ðŶ� �����ߴµ� �װ� �ƴѰ���..
 * �ᱹ ����Ž��(brute force)�� ��� ������ ���ϰ� �� ���� �ִ밪�� ���..
 */
public class q10819 {
	public static int res = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> A = new ArrayList<Integer>();
		int arr[] = new int[n]; //�Է¹��� �迭
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr); //�ϴ� ������ ���� ������������ ����� ����.
		boolean Acheck[] = new boolean[n]; //���鼭 flag�� ���� Ȯ�ο��θ�üũ
		
		soon(n, A, Acheck, arr); //�����Լ�
		
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
