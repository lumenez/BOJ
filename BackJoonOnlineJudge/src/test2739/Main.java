package test2739;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for (int i = 1 ; i <= 9 ; i ++)
			System.out.println(T + " * " + i + " = " + T*i);
		sc.close();
	}
}