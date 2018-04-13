package test2133;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		int d[];
		int a[];
		
		T = sc.nextInt();
		d = new int[31];
		a = new int[31];
		
		d[0] = 1;
		a[2] = 3;
		d[2] = 3;
 		for (int i = 4 ; i <= 30 ; i+=2) {
 			a[i] = 2;
 		}

 		for (int i = 4 ; i <= 30 ; i+=2) {
 			for (int j = 2 ; j <= i ; j+=2) {
 				d[i] += d[i-j] * a[j];
 			}
 		}
		
		System.out.println(d[T]);
		sc.close();
	}
}