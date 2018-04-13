package test3943;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, n, max;
		int d[];
		
		T = sc.nextInt();
		d = new int[100001];
		
		for (int i = 1 ; i <= T ; i ++) {
			n = sc.nextInt();
			max = n;
			while (n != 1) {
				if (n % 2 == 0) {
					n = n / 2;
					if (n > max) max = n;
				}
				else if (n % 2 == 1) {
					n = n * 3 + 1;
					if (n > max) max = n;
				}
			}
			d[i] = max;
		}

		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(d[i]);
		}
		sc.close();
	}
}