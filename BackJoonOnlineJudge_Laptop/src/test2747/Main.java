package test2747;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int d[];
		
		T = sc.nextInt();
		d = new int[46];
		d[0] = 0;
		d[1] = 1;
		
		for (int i = 2 ; i <= T ; i ++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[T]);
		sc.close();
	}
}
