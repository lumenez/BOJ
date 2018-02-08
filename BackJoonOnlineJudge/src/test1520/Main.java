package test1520;

import java.util.Scanner;

public class Main {

	static int d[][] = new int[502][502];
	static int a[][] = new int[502][502];
	
	public static void main(String[] args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		for (int i = 0 ; i <= n+1 ; i ++) {
			for (int j = 0 ; j <= m+1 ; j ++) {
				d[i][j] = -1;
				a[i][j] = 0;
			}
		}
		
		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= m ; j ++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(countWay(n, m));
		
		sc.close();
	}
	
	public static int countWay(int i, int j) {
		int result = 0;
		if (i == 1 && j == 1) {
			d[i][j] = 1;
			return d[i][j];			
		}
		else if (d[i][j] != -1)
			return d[i][j];
		else {
			if (a[i][j-1] > a[i][j])
				result += countWay(i, j-1);
			if (a[i][j+1] > a[i][j])
				result += countWay(i, j+1);
			if (a[i-1][j] > a[i][j])
				result += countWay(i-1, j);
			if (a[i+1][j] > a[i][j])
				result += countWay(i+1, j);
			d[i][j] = result;
		}
		return d[i][j];
	}
}