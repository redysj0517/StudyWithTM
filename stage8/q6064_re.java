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
		int LCM = 0; // �ּҰ����
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
			// �ּҰ������ ��������, �ִ������� �ּҰ���� ���
			int flag = 0; 
			//�ظ� ������ ��츦 �����ϱ� ���� �÷���
			int i=0;
			if(x==M && y == N){
				bw.write(LCM + "\n");
				flag = 1;
				continue;
			}// x=M, y=N �� ��� ���������� �ּҰ���� ���̴�.
			// 1. y!=N & x=M �� ��� M�� ����� N���� �������� �������� ���� �� ã��
			if(x==M){
				i = 0;
				while(M*i <= LCM){
					if((M*i) % N == y){
						// ----(a)
					bw.write(M*i + "\n");
					flag = 1;  //�ظ� ���ؼ� �÷��� �� 1 ����
					break;
				}else{
					i++;
				}
				}
			}
			
			if(y==N){
				//2 Y=N & x!=M �� ��� N�� ����� M���� ��������
				// �������� x�� ���� �� ã��
				i=0;
				while(N*i <= LCM){
					if((N*i) % M == x){
						//b
						bw.write(N*i + "\n");
						flag = 1; //�ظ� ���ؼ� �÷��� ����
						break;
					}else{ //�ظ� ��ã�� i�� ����
						i++;
					}
				}
			}
			
			// 1)�� 2)�� �����ϴ� ������ a�� b���� �����
			//�������� 0�� �Ǵ� ���� �����ϱ� ����.
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
	
	//�ִ����� ���ϴ� �Լ�
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
		} //�Ű����� �� �� ū ���� b�� ����
		
		for(int i=1; i<=a; i++){
			if(a%i==0 && b%i ==0){
				g=i;
			}
		}
		return g;
	}
}
