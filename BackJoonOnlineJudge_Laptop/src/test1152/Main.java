package test1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = new String();
		int count;
		
		string = sc.nextLine();
		count = 1;

		for (int i = 0 ; i < string.length(); i ++) {
			char a = string.charAt(i);
			if (a == 32) count++;
		}

		if (string.charAt(0) == 32) count--;
		if (string.charAt(string.length()-1) == 32) count--;
		
		System.out.println(count);
		
		sc.close();
	}
}