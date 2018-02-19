package test4344;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".000");
		int T;
		int U;
		int a[];
		int sum;
		int count;
		double avg;
		double result;
		double pct[];
		
		T = sc.nextInt();
		pct = new double[1001];

		for (int i = 1 ; i <= T ; i ++) {
			U = sc.nextInt();
			a = new int[U+1];
			sum = 0;
			count = 0;
			
			for (int j = 1 ; j <= U ; j++) {
				a[j] = sc.nextInt();
				sum += a[j];
			}
			avg = sum / U;
			
			for (int j = 1 ; j <= U ; j++) {
				if (a[j] > avg) count++;
			}
			result = (double) count / U;
			result = result * 100000;
			pct[i] = (Math.round(result) / 1000.0);
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			if (pct[i] == 0.0) {
				System.out.println("0.000%");
				continue;
			}
			String number = df.format(pct[i]);
			System.out.println(number + "%");
		}
		sc.close();
	}
}
