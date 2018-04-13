package test1890;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long d[][], a[][];

		n = sc.nextInt();
		d = new long[101][101];
		a = new long[101][101];
		
		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= n ; j ++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		d[1][1] = 1;

		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= n ; j ++) {
				if (i == n && j == n) break;
				if (d[i][j] > 0) {
					if (i + a[i][j] <= n) d[(int) (i + a[i][j])][j] = d[i][j] + d[(int) (i + a[i][j])][j];
					if (j + a[i][j] <= n) d[i][(int) (j + a[i][j])] = d[i][j] + d[i][(int) (j + a[i][j])];
				}
			}
		}
		
		System.out.println(d[n][n]);
		sc.close();
	}
}