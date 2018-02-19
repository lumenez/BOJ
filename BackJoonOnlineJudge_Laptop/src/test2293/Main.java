package test2293;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int d[], a[];

		n = sc.nextInt();
		k = sc.nextInt();		
		d = new int[k+1];
		a = new int[n+1];

		d[0] = 1;
		
		for (int i = 1 ; i <= n ; i ++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= k ; j ++) {
				if (j - a[i] >= 0) {
					d[j] += d[j-a[i]];
				}
			}
		}
		
		System.out.println(d[k]);
		sc.close();
	}
}