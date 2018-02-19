package test1912;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int d[];
		int a[];
		int b[];
		
		T = sc.nextInt();
		d = new int[100001];
		a = new int[100001];
		b = new int[100001];

		for (int i = 1 ; i <= T ; i ++) {			
			a[i] = sc.nextInt();
		}
		
		d[1] = a[1];

		for (int i = 2 ; i <= T ; i ++) {
			d[i] = d[i-1];
			b[i] = 0;
			for (int j = i ; j >= 1 ; j --) {
				b[i] += a[j];
				if (b[i] > d[i]) d[i] = b[i];
			}
		}
		
		System.out.println(d[T]);
		sc.close();
	}
}
