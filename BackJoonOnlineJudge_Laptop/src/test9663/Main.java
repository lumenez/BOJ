package test9663;

import java.util.Scanner;

public class Main {
	static int result ,T;
	static int queen[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();
		result = 0;
		queen = new int[T+1];

		for (int i = 1 ; i <= T ; i ++) {
			queen[1] = i;
			dfs(1);
		}
		System.out.println(result);
		sc.close();
	}
	
	public static void dfs(int count) {
		if (count == T) {
			result++;
		}
		else {
			for (int i = 1 ; i <= T ; i ++) {
				queen[count+1] = i;
				if (checkQueen(count+1)) {
					dfs(count+1);
				}
				else queen[count+1] = 0;
			}
		}
	}
	
	public static boolean checkQueen(int pos) {
		boolean isPossible = true;
		for (int i = 1 ; i < pos ; i ++) {
			if (queen[i] == queen[pos]) {
				isPossible = false;
				break;
			}
			if (Math.abs(queen[i] - queen[pos]) == pos - i) {
				isPossible = false;
				break;
			}
		}
		return isPossible;
	}
}