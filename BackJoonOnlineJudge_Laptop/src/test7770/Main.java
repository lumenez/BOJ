package test7770;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int d[], a[];
		int result;
		
		n = sc.nextInt();
		d = new int[1201];
		a = new int[1201];
		
		
		d[1] = 1;
		a[1] = 1;
		result = 1;
		
		for (int i = 2 ; i <= 1200 ; i ++) {
			for (int j = 1 ; j <= i ; j ++) {
				a[i] += 2*(2*j-1);
			}
			a[i] -= 2*i-1;
			d[i] = d[i-1] + a[i];
		}
		
		while (n >= d[result]) {
			result++;
		}
		
		System.out.println(result-1);
		sc.close();
	}
}