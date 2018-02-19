package test11057;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int d[][];
		int result[];
		
		T = sc.nextInt();
		d = new int[1001][1001];
		result = new int[1001];
		
		for (int i = 0 ; i <= 9 ; i ++) {
			d[1][i] = 1;
			result[1] += d[1][i];
		}
		
		for (int i = 2 ; i <= T ; i ++) {
			for (int j = 0 ; j <= 9 ; j ++) {
				int count = j;
				d[i][j] = 0;
				while (count >= 0) {
					d[i][j] += (d[i-1][count] % 10007);
					count--;
				}
				result[i] += (d[i][j] % 10007);
			}
		}
		
		System.out.println(result[T] % 10007);
		sc.close();
	}
}
