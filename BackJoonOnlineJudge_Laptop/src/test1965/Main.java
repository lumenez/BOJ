package test1965;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T;
		int d[];
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		T = sc.nextInt();
		d = new int[1001];
		
		for (int i = 0 ; i < T ; i ++) {
			d[i] = sc.nextInt();
		}
		
		arrayList.add(d[0]);
		

		for (int i = 1 ; i < T ; i ++) {
			if (d[i] > arrayList.get(arrayList.size()-1)) {
				arrayList.add(d[i]);
			}
			else {
				for (int j = arrayList.size()-1 ; j >= 0 ; j --) {
					if (d[i] > arrayList.get(j)) {
						arrayList.set(j+1, d[i]);
						break;
					}
					if (j == 0 && d[i] < arrayList.get(j))
						arrayList.set(j, d[i]);
				}
			}
		}
		
		System.out.println(arrayList.size());
		sc.close();
	}
}