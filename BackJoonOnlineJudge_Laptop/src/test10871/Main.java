package test10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, X;
		int temp;
		int count;
		int a[];
		
		N = sc.nextInt();
		X = sc.nextInt();
		count = 1;
		a = new int[N+1];
		
		for (int i = 1 ; i <= N ; i ++) {
			temp = sc.nextInt();
			if (temp < X) {
				a[count] = temp;
				count++;
			}
		}
		
		for (int i = 1 ; i < count - 1 ; i ++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[count - 1]);
		
		sc.close();
	}
}
