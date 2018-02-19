package test11399;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		int result;
		int d[];
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		T = sc.nextInt();
		d = new int[1001];

		for (int i = 1 ; i <= T ; i ++) {
			a.add(sc.nextInt());
		}
		
		Collections.sort(a);
		
		d[1] = a.get(0);
		result = d[1];

		for (int i = 2 ; i <= T ; i ++) {
			d[i] = d[i-1] + a.get(i-1);
			result += d[i];
		}
		
		System.out.println(result);
		sc.close();
	}
}
