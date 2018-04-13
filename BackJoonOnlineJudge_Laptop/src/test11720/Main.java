package test11720;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		BigInteger n;
		BigInteger temp;
		int result;
		
		T = sc.nextInt();
		n = sc.nextBigInteger();
		result = 0;
		
		for (int i = 1 ; i <= T ; i ++) {
			temp = n;
			temp = temp.divide(BigInteger.valueOf(10));
			temp = temp.multiply(BigInteger.valueOf(10));
			result = n.subtract(temp).add(BigInteger.valueOf(result)).intValue();
			n = n.divide(BigInteger.valueOf(10));
		}
		
		System.out.println(result);
		sc.close();
	}
}