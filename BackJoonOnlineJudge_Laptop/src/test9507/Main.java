package test9507;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		long d[];
		int r[];
		
		T = sc.nextInt();
		d = new long[69];
		r = new int[69];
		
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for (int i = 4 ; i <= 68 ; i ++) {
			d[i] = d[i-1] + d[i-2] + d[i-3] + d[i-4];
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			r[i] = sc.nextInt();
		}
		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(d[r[i]]);
		}
	}
}