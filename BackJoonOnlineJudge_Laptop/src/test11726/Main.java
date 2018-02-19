package test11726;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		BigInteger d[] = new BigInteger[1001];
		T = sc.nextInt();
		
		d[1] = BigInteger.ONE;
		d[2] = BigInteger.valueOf(2);
		
		for (int i = 3 ; i <= T ; i ++) {			
			d[i] = d[i-1].add(d[i-2]);
		}
		
		System.out.println(d[T].mod(BigInteger.valueOf(10007)));
		sc.close();
	}
}