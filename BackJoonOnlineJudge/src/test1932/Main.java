package test1932;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		int count;
		int max;
		int d[][];
		int a[][];
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		d = a = new int[501][501];
		count = 1;
		
		for (int i = 1 ; i <= T ; i ++) {
			for (int j = 1 ; j <= i ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		max = d[1][1] = a[1][1];
		

		for (int i = 2 ; i <= T ; i ++) {
			for (int j = 1 ; j <= i ; j++) {
				if (j == 1) d[i][j] = d[i-1][j] + a[i][j];
				else if (j == i) d[i][j] = d[i-1][j-1] + a[i][j];
				else d[i][j] = Math.max(d[i-1][j] + a[i][j], d[i-1][j-1] + a[i][j]);
				max = Math.max(max, d[i][j]);
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}