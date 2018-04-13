package test1003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int d[][];

		T = sc.nextInt();
		d = new int[41][41];
		
		d[0][0] = 1;
		d[1][0] = 0;
		d[0][1] = 0;
		d[1][1] = 1;
		
		for (int i = 2 ; i <= 40 ; i ++) {
			d[0][i] = d[0][i-1] + d[0][i-2];
			d[1][i] = d[1][i-1] + d[1][i-2];
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			int p = sc.nextInt();
			System.out.print(d[0][p] + " " + d[1][p]);
			System.out.println();
		}
		
		sc.close();
	}
}