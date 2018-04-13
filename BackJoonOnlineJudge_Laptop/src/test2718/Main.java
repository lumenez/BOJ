package test2718;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T, n;
		int d[], a[];
		
		T = sc.nextInt();
		d = new int[T+1];
		a = new int[100001];

		for (int i = 1 ; i <= T ; i ++) {
			n = sc.nextInt();
			a[1] = 1;
			a[2] = 5;
			a[3] = 11;

			for (int j = 4 ; j <= n ; j ++) {
				a[j] = a[j-1] + a[j-2] * 5 + a[j-3] * 2;
			}
			d[i] = a[n];
 		}

		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(d[i]);
		}
		sc.close();
	}
}