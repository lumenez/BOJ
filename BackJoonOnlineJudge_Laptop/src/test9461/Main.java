package test9461;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, n;
		long d[];
		long result[];

		T = sc.nextInt();
		d = new long[101];
		result = new long[101];
		
		d[1] = d[2] = d[3] = 1;
		d[4] = d[5] = 2;
		
		for (int i = 6 ; i <= 100 ; i ++) {
			d[i] = d[i-1] + d[i-5];
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			n = sc.nextInt();
			result[i] = d[n];
		}

		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(result[i]);
		}

		sc.close();
	}
}