package stage12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
/*
 * 큐를 만들고 선택된 우선순위를 마치 포인터처럼 쭉 따라가는 파라미터가 하나 필요함
 */
public class q1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<Integer> q = null;
		
		int T = Integer.parseInt(br.readLine());
		int n,m;
		while(T-- >0){
			q = new LinkedList<>();
			String line[] = br.readLine().split(" ");
			n = Integer.parseInt(line[0]);
			m = Integer.parseInt(line[1]);
			line = br.readLine().split(" ");
			for(int i=0; i<n; i++){
				q.add(Integer.parseInt(line[i]));
			}
			System.out.println(go(n,m,q));
		}
		
		
	}
	public static int go(int n, int m, LinkedList<Integer> q){
		int cnt = 0;
		int pointer = m;
		while(!q.isEmpty()){
			if(isMax(q)){
				cnt++;
				q.poll();
				if(pointer == 0)
					return cnt;
			}
			else{
				q.add(q.poll());
			}
			if(pointer == 0)
				pointer = q.size()-1;
			else
				pointer--;
		}
		return cnt;
	}
	public static boolean isMax(LinkedList<Integer> q){
		for(int i=0; i<q.size(); i++){
			if(q.get(i) >  q.get(0))
				return false;
		}
		return true;
	}
}

