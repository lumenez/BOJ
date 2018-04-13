package test9012;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		String string;
		String answer[];
		char a;
		int left, right;
		Stack<Integer> stack = new Stack<Integer>();
		
		string = new String();
		T = sc.nextInt();
		answer = new String[T+1];
		left = 0;
		right = 0;
		
		
		
		for (int i = 1 ; i <= T ; i ++) {
			string = sc.next();
			//System.out.println(string);
			
			for (int j = 0 ; j < string.length() ; j ++) {
				a = string.charAt(j);
				if (a == 40) left++;
				else if (a == 41) right++;
			}
			if (left == right) answer[i] = "YES";
			else answer[i] = "NO";
			left = 0;
			right = 0;
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			System.out.println(answer[i]);
		}
		sc.close();
	}
}
