package test2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		String string;
		
		T = sc.nextInt();

		for (int i = 1 ; i <= T ; i ++) {
			string = "";
			for (int j = 1 ; j <= i ; j ++) {
				string += "*";
			}
			System.out.println(string);
		}
		sc.close();
	}
}
