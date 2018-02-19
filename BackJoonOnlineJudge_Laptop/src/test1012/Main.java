package test1012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int m, n, k;
		int count[];
		int a[][];
		
		T = sc.nextInt();
		a = new int[51][51];
		count = new int[51];
		
		for (int i = 1 ; i <= T ; i ++) {
			m = sc.nextInt();
			n = sc.nextInt();
			k = sc.nextInt();
			count[i] = 0;

			for (int x = 0 ; x <= m ; x ++) {
				for (int y = 0 ; y <= m ; y ++) {
					a[x][y] = 0;
				}
			}
			
			for (int j = 1 ; j <= k ; j ++) {
				int p, q;
				p = sc.nextInt();
				q = sc.nextInt();
				a[p][q] = 1;
			}
			
			count[i] = a[1][1];
			
			for (int x = 1 ; x <= m ; x ++) {
				for (int y = 1 ; y <= n ; y ++) {
					if (x == 1 & y == 1) continue;
					else {
						if (a[x][y-1] == 0 && a[x-1][y] == 0 && a[x][y] == 1) {
							count[i]++;
						}
					}
				}
			}
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(count[i]);
		}
		sc.close();
	}
}
