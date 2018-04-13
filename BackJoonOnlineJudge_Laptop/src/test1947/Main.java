package test1947;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		long d[] = new long[1000001];
		
		d[1] = 0;
		d[2] = 1;
		d[3] = 2;
		
		for (int i = 4 ; i <= T ; i ++) {
			d[i] = (i-1)*(d[i-1]+d[i-2]);
			d[i] %= 1000000000;
		}
		System.out.println(d[T] % 1000000000);
		sc.close();
	}
}