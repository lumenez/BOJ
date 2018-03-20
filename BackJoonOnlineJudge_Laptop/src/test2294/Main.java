package test2294;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int d[];
		int a[];

		n = sc.nextInt();	
		k = sc.nextInt();	
		d = new int[1000001];
		a = new int[101];

		for (int i = 1 ; i <= 10000 ; i ++) {
			d[i] = 987654321;
		}
		
		for (int i = 1 ; i <= n ; i ++) {
			a[i] = sc.nextInt();
			d[a[i]] = 1;
		}
		
		for (int i = 1 ; i <= k ; i ++) {
			for (int j = 1 ; j <= n ; j ++) {
				if (i-a[j] > 0) d[i] = Math.min(d[i], d[i-a[j]] + 1);
			}
		}
		
		if (d[k] == 987654321) System.out.println(-1);
		else System.out.println(d[k]);
		
		sc.close();
	}
}