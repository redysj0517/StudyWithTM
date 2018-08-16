package dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS_list {
	static int nv;
	static int ne;
	static boolean[] visit;
	static ArrayList<ArrayList<Integer>> arr;
	
	public static void dfs(int i) {
		visit[i] = true;
		System.out.println(i);
		
		for(int j : arr.get(i)) {
			if(visit[j]==false) {
				dfs(j);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 nv = sc.nextInt();
		 ne = sc.nextInt();
		 arr = new ArrayList<>(nv+1);
		 visit = new boolean[nv+1];
		 
		 for(int i=0; i<nv+1; i++) {
			 arr.add(new ArrayList());
		 }
		 for(int i=0; i<ne; i++) {
			 int t1 = sc.nextInt();
			 int t2 = sc.nextInt();
			 
			 arr.get(t1).add(t2);
			 arr.get(t2).add(t1);
		 }
		 dfs(1);
	}
}
