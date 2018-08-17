package d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * D2.1926 간단한 369게임
 * 해당숫자에 3,6,9가 각자리에 들어있는지 확인하여 출력
 * int 타입을 String으로 변환후에 각자리에 있는 숫자를 3,6,9를 확인하여 출력햇음
 * 내부 로직을 보면 for문을 두번돌게되는데.. 더 좋은 방법을 잘 모르겠음ㅜ
 */
public class q1926 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			String temp = Integer.toString(i);
			char arr[] = temp.toCharArray();
			boolean flag = false;
			for(int j=0; j<arr.length; j++){
				if(arr[j]=='3' || arr[j]=='6' || arr[j] =='9'){
					flag = true;
					bw.write("-");
				}
			}
			if(!flag){
				bw.write(i+"");
			}
			bw.write(" ");
		}
		bw.flush();
	}

}
