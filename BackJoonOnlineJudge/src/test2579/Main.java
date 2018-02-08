package test2579;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		int d[];
		int a[];
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		d = new int[301];
		a = new int[301];
		
		for (int i = 1 ; i <= T ; i ++) {
			a[i] = sc.nextInt();
		}
		
		d[1] = a[1];
		d[2] = a[1] + a[2];
		d[3] = Math.max(a[1] + a[3], a[2] + a[3]);
		
		for (int i = 4 ; i <= T ; i ++) {
			d[i] = Math.max(d[i-3] + a[i-1] + a[i], d[i-2] + a[i]);
		}
	
		System.out.println(d[T]);
		sc.close();
	}
}