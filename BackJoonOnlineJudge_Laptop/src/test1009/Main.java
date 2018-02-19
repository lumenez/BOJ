package test1009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, temp1, temp2;
		int a[], b[], ans[];

		T = sc.nextInt();
		a = new int[T+1];
		b = new int[T+1];
		ans = new int[T+1];
		
		for (int i = 1 ; i <= T ; i ++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			ans[i] = a[i];
		}
		for (int i = 1 ; i <= T ; i ++) {
			for (int j = 2 ; j <= b[i] ; j ++) {
				temp1 = ans[i] * a[i];
				temp2 = temp1 / 10;
				temp2 = temp2 * 10;
				temp1 = temp1 - temp2;
				ans[i] = temp1;
				if (ans[i] == 0) ans[i] = 10;
			}
		}

		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(ans[i]);
		}
		sc.close();
	}
}