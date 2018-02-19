package test10844;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		long d[][];
		BigInteger count;
		BigInteger mod;
		
		T = sc.nextInt();
		d = new long[T+1][10];
		count = new BigInteger("0");
		count = BigInteger.ZERO;
		mod = new BigInteger("1000000000");

		for (int i = 0 ; i <= 9 ; i ++) {
			d[1][i] = 1;
		}
		
		for (int i = 2 ; i <= T ; i ++) {
			for (int j = 0 ; j <= 9 ; j ++) {
				if (j == 0) {
					d[i][j] = d[i-1][j+1];
				}
				else if (j == 9) {
					d[i][j] = d[i-1][j-1];
				}
				else {
					d[i][j] = d[i-1][j-1] + d[i-1][j+1];
				}
				d[i][j] %= mod.intValue();
			}
		}
		
		for (int i = 1 ; i <= 9 ; i ++) {
			count = count.add(BigInteger.valueOf(d[T][i]));
		}
		
		System.out.println(count.mod(mod));
		sc.close();
	}
}
