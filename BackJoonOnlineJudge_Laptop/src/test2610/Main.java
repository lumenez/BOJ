package test2610;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		int d[][];
		
		N = sc.nextInt();
		M = sc.nextInt();
		d = new int[101][101];

		for (int i = 1 ; i <= N ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				d[i][j] = 9876;
			}
		}
		for (int i = 1 ; i <= M ; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			d[a][b] = 1;
			d[b][a] = 1;
		}

		for (int k = 1 ; k <= N ; k ++) {
			for (int i = 1 ; i <= N ; i ++) {
				for (int j = 1 ; j <= N ; j ++) {
					//if (d[i][j] == 987654321 || d[j][i] == 987654321) continue;
					if (d[i][j] > d[i][k] + d[k][j]) d[i][j] = d[i][k] + d[k][j];
				}
			}
		}
		

		for (int i = 1 ; i <= N ; i ++) {
			for (int j = 1 ; j <= N ; j ++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	
		System.out.println();
		sc.close();
	}
}