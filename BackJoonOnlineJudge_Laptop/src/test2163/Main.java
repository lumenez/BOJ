package test2163;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int d[][];
		
		n = sc.nextInt();
		m = sc.nextInt();
		d = new int[n+1][m+1];
		
		d[1][1] = 0;
		
		for (int i = 2 ; i <= n ; i ++) {
			d[i][1] = i-1;
		}
		
		for (int j = 2 ; j <= m ; j ++) {
			d[1][j] = j-1;
		}
		
		for (int i = 2 ; i <= n ; i ++) {
			for (int j = 2 ; j <= m ; j ++) {
				d[i][j] = Math.min(d[i-1][j] + j, d[i][j-1] + i);
			}
		}
		
		System.out.println(d[n][m]);
		sc.close();
	}
}