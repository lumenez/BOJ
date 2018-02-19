package test11727;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int d[];

		T = sc.nextInt();	
		d = new int[1001];

		d[1] = 1;
		d[2] = 3;
		
		for (int i = 3 ; i <= T ; i ++) {
			d[i] = (d[i-1] + d[i-2] * 2) % 10007;
		}
		
		System.out.println(d[T] % 10007);
		sc.close();
	}
}