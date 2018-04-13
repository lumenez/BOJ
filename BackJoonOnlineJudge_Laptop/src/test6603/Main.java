package test6603;

import java.util.Scanner;

public class Main {
	static int T;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		while(T != 0) {
			int d[] = new int[T];
			
			for (int i = 0 ; i < T ; i ++) {
				d[i] = sc.nextInt();
			}
			
			dfs(0, "", d, 0);
			System.out.println();
			T = sc.nextInt();
		}
		sc.close();
	}
	
	public static void dfs(int count, String str, int d[], int pos) {
		if (count == 6) {
			System.out.println(str);
		}
		else {
			for (int i = pos ; i < T ; i ++) {
				dfs(count+1, str + d[i] + " ", d, i+1);
			}
		}
	}
}