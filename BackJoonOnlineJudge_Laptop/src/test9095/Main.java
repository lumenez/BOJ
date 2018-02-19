package test9095;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int a[];
		int d[];
		
		T = sc.nextInt();
		d = new int[12];
		a = new int[12];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;

		for (int i = 1 ; i <= T ; i ++) {			
			a[i] = sc.nextInt();
		}
		
		for (int i = 4 ; i <= 11 ; i ++) {
			d[i] = d[i-1] + d[i-2] + d[i-3];
		}
		
		for (int i = 1 ; i <= T ; i ++) {			
			System.out.println(d[a[i]]);			
		}
	}

}
