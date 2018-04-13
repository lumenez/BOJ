package test9465;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, n;
		int d[][], a[][], result[];

		T = sc.nextInt();
		d = new int[3][100001];
		a = new int[3][100001];
		result = new int[100001];
		
		for (int i = 1 ; i <= T ; i ++) {
			n = sc.nextInt();
			for (int j = 1 ; j <= n ; j ++) {
				a[1][j] = sc.nextInt();
			}
			for (int j = 1 ; j <= n ; j ++) {
				a[2][j] = sc.nextInt();
			}
			d[1][1] = a[1][1];
			d[2][1] = a[2][1];
			result[1] = Math.max(d[1][1], d[2][1]);
			for (int j = 2 ; j <= n ; j ++) {
				
			}
		}
		
		sc.close();
	}
}