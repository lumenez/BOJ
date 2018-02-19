package test5721;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		int d[], a[], cost[];

		m = sc.nextInt();
		n = sc.nextInt();
		d = new int[100001];
		a = new int[100001];
		cost = new int[100001];

		while (m != 0 || n != 0) {
			d[0] = 0;
			for (int i = 1 ; i <= m ; i ++) {
				for (int j = 1 ; j <= n ; j ++) {
					a[j] = sc.nextInt();
				}
				d[1] = a[1];
				for (int j = 2 ; j <= n ; j ++) {
					d[j] = Math.max(d[j-1], d[j-2] + a[j]);
				}
				cost[i] = d[n];
				
				for (int j = 1 ; j <= n ; j ++) {
					d[j] = 0;
				}
			}
			cost[0] = 0;
			for (int i = 2 ; i <= m ; i ++) {
				cost[i] = Math.max(cost[i-1], cost[i-2] + cost[i]);
			}
			System.out.println(cost[m]);
			m = sc.nextInt();
			n = sc.nextInt();
		}
		sc.close();
	}
}