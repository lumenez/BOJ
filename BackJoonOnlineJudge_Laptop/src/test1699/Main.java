package test1699;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int d[], a[];

		n = sc.nextInt();
		d = new int[100001];
		a = new int[317];
		
		for (int i = 1 ; i <= 100000 ; i ++) {
			d[i] = 987654321;
		}
		
		for (int i = 1 ; i * i <= 100000 ; i ++) {
			a[i] = i*i;
			d[i*i] = 1;
		}
		
		for (int i = 1 ; i <= 100000 ; i ++) {
			for (int j = 1 ; j <= 316 ; j ++) {
				if (i-a[j] > 0) d[i] = Math.min(d[i], d[i-a[j]] + 1);
			}
		}

		System.out.println(d[n]);
		sc.close();
	}
}