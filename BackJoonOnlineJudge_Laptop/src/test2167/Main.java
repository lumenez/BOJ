package test2167;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, k;
		int i[], j[], x[], y[];
		int a[][];
		int T[];
		
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n+1][m+1];
		
		for (int p = 1 ; p <= n ; p ++) {
			for (int q = 1 ; q <= m ; q ++) {
				a[p][q] = sc.nextInt();
			}
		}
		
		k = sc.nextInt();
		
		i = new int[k+1];
		j = new int[k+1];
		x = new int[k+1];
		y = new int[k+1];
		T = new int[k+1];
		
		for (int p = 1 ; p <= k ; p ++) {
			i[p] = sc.nextInt();
			j[p] = sc.nextInt();
			x[p] = sc.nextInt();
			y[p] = sc.nextInt();
			T[p] = 0;
		} 

		for (int p = 1 ; p <= k ; p ++) {
			for (int q = i[p] ; q <= x[p] ; q ++) {
				for (int r = j[p] ; r <= y[p] ; r ++) {
					T[p] += a[q][r];
				}				
			}
			System.out.println(T[p]);
		}
		sc.close();
	}
}