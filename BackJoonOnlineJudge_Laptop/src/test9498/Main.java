package test9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		
		T = sc.nextInt();
		
		if (T >= 90) System.out.println("A");
		else if (T >= 80 && T < 90) System.out.println("B");
		else if (T >= 70 && T < 80) System.out.println("C");
		else if (T >= 60 && T < 70) System.out.println("D");
		else System.out.println("F");
		
		sc.close();
	}
}
