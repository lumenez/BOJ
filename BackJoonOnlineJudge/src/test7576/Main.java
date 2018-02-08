package test7576;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int n, m;
		int date;
		int countZero[];
		int a[][];
		boolean bool;
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		date = 1;
		countZero = new int[1002];
		a = new int[1002][1002];
		bool = true;
		
		for (int i = 0 ; i <= n+1 ; i ++) {
			for (int j = 0 ; j <= m+1 ; j ++) {
				a[i][j] = -1;
			}
		}
		
		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= m ; j ++) {
				a[i][j] = sc.nextInt();
				if (a[i][j] == 0) countZero[0]++; 
			}
		}
		
		while (bool) {
			countZero[date] = 0;
			for (int i = 1 ; i <= n ; i ++) {
				for (int j = 1 ; j <= m ; j ++) {
					if (a[i][j] == 1) {
						if (a[i+1][j] == 0 && a[i+1][j] != 1 && a[i+1][j] != -1) a[i+1][j] = 1;
						if (a[i-1][j] == 0 && a[i-1][j] != 1 && a[i-1][j] != -1) a[i-1][j] = 1;
						if (a[i][j+1] == 0 && a[i][j+1] != 1 && a[i][j+1] != -1) a[i][j+1] = 1;
						if (a[i][j-1] == 0 && a[i][j-1] != 1 && a[i][j-1] != -1) a[i][j-1] = 1;
					}
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			for (int i = 1 ; i <= n ; i ++) {
				for (int j = 1 ; j <= m ; j ++) {
					if (a[i][j] == 0) countZero[date]++;
				}
			}
			if (countZero[date] == countZero[date-1]) bool = false;
			else date++;
		}
		if (countZero[date] > 0) System.out.println(-1);
		else System.out.println(date-1);
		sc.close();
	}
}