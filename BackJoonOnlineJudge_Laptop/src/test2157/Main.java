package test2157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		int d[][] = new int[301][301];
		int a[][] = new int[301][301];
		int result = 0;
		
		d[1][1] = 0;
		
		for (int i = 1 ; i <= K ; i ++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int weight = sc.nextInt();
			if (x < y && weight > a[x][y]) a[x][y] = weight; 
		}
		
		for (int i = 2 ; i <= K ; i ++) {
			int min = Math.min(i, M);
			for (int j = 1 ; j <= min ; j ++) {
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}