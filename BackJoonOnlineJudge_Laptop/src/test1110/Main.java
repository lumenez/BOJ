package test1110;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value, nextValue, count, a, b;
		
		value = sc.nextInt();
		nextValue = value;
		count = 0;
		
		while (true) {
			b = nextValue - (nextValue / 10) * 10;
			a = (nextValue - b) / 10;
			nextValue = a + b;
			nextValue %= 10;
			nextValue = (b * 10) + nextValue;
			count++;
			if (value == nextValue) break;
		}
		
		System.out.println(count);
		sc.close();
	}
}