package test2577;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, number, temp, n;
		int d[];

		a = sc.nextInt();	
		b = sc.nextInt();	
		c = sc.nextInt();	
		d = new int[10];
		
		number = a * b * c;
		
		while (number > 0) {
			temp = number / 10;
			temp = temp * 10;
			n = number - temp;
			d[n]++;
			number = number / 10;
		}
		
		for (int i = 0 ; i <= 9 ; i ++) {
			System.out.println(d[i]);
		}
		sc.close();
	}
}