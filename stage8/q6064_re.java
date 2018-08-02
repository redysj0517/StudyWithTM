package stage8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q6064_re {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int M = 0, N =0, x = 0, y = 0;
		int LCM = 0; // 최소공배수
		int T = Integer.parseInt(br.readLine());
		for (int testCase = 0; testCase < T; testCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				M = Integer.parseInt(st.nextToken());
				N = Integer.parseInt(st.nextToken());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
			}
			LCM = (M*N) / GCD(M,N);
			// 최소공배수가 마지막해, 최대공약수로 최소공배수 계산
			int flag = 0; 
			//해를 구했을 경우를 구분하기 위한 플래그
			int i=0;
			if(x==M && y == N){
				bw.write(LCM + "\n");
				flag = 1;
				continue;
			}// x=M, y=N 일 경우 마지막해인 최소공배수 값이다.
			// 1. y!=N & x=M 일 경우 M의 배수중 N으로 나눴을때 나머지가 같은 수 찾기
			if(x==M){
				i = 0;
				while(M*i <= LCM){
					if((M*i) % N == y){
						// ----(a)
					bw.write(M*i + "\n");
					flag = 1;  //해를 구해서 플래그 값 1 저장
					break;
				}else{
					i++;
				}
				}
			}
			
			if(y==N){
				//2 Y=N & x!=M 일 경우 N의 배수중 M으로 나눴을때
				// 나머지가 x와 같은 수 찾기
				i=0;
				while(N*i <= LCM){
					if((N*i) % M == x){
						//b
						bw.write(N*i + "\n");
						flag = 1; //해를 구해서 플래그 저장
						break;
					}else{ //해를 못찾아 i를 증가
						i++;
					}
				}
			}
			
			// 1)과 2)를 구분하는 이유는 a와 b에서 계산한
			//나머지가 0이 되는 것을 방지하기 위해.
			if(x!=M && y!=N){
				i=0;
				while(M*i + x <= LCM){
					if(M*i + x <= LCM){
						if((M*i + x) % N ==y){
							bw.write(M*i + x +"\n");
							flag = 1;
							break;
						}else{
							i++;
						}
					}
				}
			}
			if(flag ==0)
				bw.write(-1 + "\n");
		}
		bw.flush();
	}
	
	//최대공약수 구하는 함수
	public static int GCD(int a, int b){
		int temp = 0;
		int g = 0;
		
		if(a==b){
			return a;
		}
		else if(a>b){
			temp = a;
			a = b;
			b = temp;
		} //매개변수 값 중 큰 수를 b에 저장
		
		for(int i=1; i<=a; i++){
			if(a%i==0 && b%i ==0){
				g=i;
			}
		}
		return g;
	}
}
