package test10817;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		int max, min, result;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		max = Math.max(a, Math.max(b, c));
		min = Math.min(a, Math.min(b, c));
		
		result = a + b + c - max - min;
		System.out.println(result);
	}
}