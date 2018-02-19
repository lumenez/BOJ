package test2750;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		T = sc.nextInt();
		for (int i = 1 ; i <= T ; i ++) {
			arrayList.add(sc.nextInt());
		}
		arrayList.sort(null);
		
		for (int i = 0 ; i < T ; i ++) {
			System.out.println(arrayList.get(i));
		}
		
		sc.close();
	}
}