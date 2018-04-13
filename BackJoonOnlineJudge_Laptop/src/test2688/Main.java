package test2688;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		long d[];
		int r[];
		long a[][];
		
		T = sc.nextInt();
		d = new long[65];
		r = new int[65];
		a = new long[10][65];
		
		for (int i = 0 ; i <= 9 ; i ++) {
			a[i][1] = 1;
			d[1] += a[i][1];
		}

		for (int i = 2 ; i <= 64 ; i ++) {
			for (int j = 0 ; j <= 9 ; j ++) {
				for (int k = 0 ; k <= j ; k ++) {
					a[j][i] += a[k][i-1];
				}
				d[i] += a[j][i];
			}
		}

		for (int i = 1 ; i <= T ; i ++) {
			r[i] = sc.nextInt();
		}
		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(d[r[i]]);
		}
	}
}