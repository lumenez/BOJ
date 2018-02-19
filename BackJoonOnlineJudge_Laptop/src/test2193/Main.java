package test2193;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		long d[];
		
		T = sc.nextInt();
		d = new long[91];
		
		d[1] = 1;
		d[2] = 1;
		d[3] = 2;

		for (int i = 4 ; i <= T ; i ++) {			
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[T]);
		sc.close();
	}
}
