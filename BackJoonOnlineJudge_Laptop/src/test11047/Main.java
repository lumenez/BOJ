package test11047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k, result;
		int a[];

		n = sc.nextInt();
		k = sc.nextInt();
		a = new int[11];
		result = 0;
		
		for (int i = 1 ; i <= n ; i ++) {
			a[i] = sc.nextInt();
		}
		
		while (k > 0) {
			for (int i = n ; i >= 1 ; i --) {
				while (k >= a[i]) {
					k = k - a[i];
					result++;
				}
			}
		}

		System.out.println(result);
		sc.close();
	}
}