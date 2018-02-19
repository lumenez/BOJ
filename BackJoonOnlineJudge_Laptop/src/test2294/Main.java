package test2294;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, def;
		int d[];
		int a[];

		n = sc.nextInt();	
		k = sc.nextInt();	
		d = new int[10001];
		a = new int[10001];
		def = 987654321;

		for (int i = 1 ; i <= n ; i ++) {
			a[i] = sc.nextInt();
			d[a[i]] = 1;
		}
		
		for (int i = 1 ; i <= k ; i ++) {
			if (d[i] == 1) continue;
				for (int j = 1 ; j <= n ; j ++) {
				if (i - a[j] > 0) {
					def = Math.min(def, d[i-a[j]]);
				}
			}
			d[i] = def+1;
		}
		System.out.println(d[k]);
		sc.close();
	}
}