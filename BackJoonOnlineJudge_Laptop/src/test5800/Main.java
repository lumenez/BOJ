package test5800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, n;
		T = sc.nextInt();
		
		ArrayList<Integer> arrayList[] = new ArrayList[101];
		
		for (int i = 1 ; i <= 100 ; i ++) {
			arrayList[i] = new ArrayList<Integer>();
		}

		for (int i = 1 ; i <= T ; i ++) {
			n = sc.nextInt();
			for (int j = 1 ; j <= n ; j ++) {
				arrayList[i].add(sc.nextInt());
			}
			Collections.sort(arrayList[i]);
		}
		
		for (int i = 1 ; i <= T ; i ++) {
			int max = arrayList[i].get(arrayList[i].size()-1);
			int min = arrayList[i].get(0);
			int gap = 0;
			
			for (int j = 1 ; j < arrayList[i].size() ; j ++) {
				if (arrayList[i].get(j) - arrayList[i].get(j-1) > gap)
					gap = arrayList[i].get(j) - arrayList[i].get(j-1);
			}
			System.out.println("Class " + i);
			System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
		}
		sc.close();
	}
}