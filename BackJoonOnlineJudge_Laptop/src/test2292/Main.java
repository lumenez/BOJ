package test2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int d[];
		
		T = sc.nextInt();
		d = new int[10000001];

		d[1] = 1;
		
		for (int i = 2 ; i <= 10000000 ; i ++) {
			d[i] = d[i-1] + (i-1) * 6;
		}
		
		for (int i = 1 ; i <= 10000000 ; i ++) {
			if (d[i] >= T) {
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
}
