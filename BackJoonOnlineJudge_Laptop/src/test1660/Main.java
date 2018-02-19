package test1660;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, temp;
		int a[], res[], d[];

		T = sc.nextInt();
		a = new int[300001];
		res = new int[300001];
		d = new int[300001];

		a[1] = 1;
		res[1] = 1;
		d[1] = 1;

		for (int i = 2 ; i <= 300000 ; i ++) {
			d[i] = 987654321;
			a[i] = a[i-1] + i;
			res[i] = res[i-1] + a[i];
		}
		
		for (int i = 2 ; res[i] <= 300000 ; i ++) {
			d[res[i]] = 1;
		}
		

		for (int i = 2 ; i <= 300000 ; i ++) {
			if (d[i] == 1) continue;
			temp = d[i];
			for (int j = 1 ; i > res[j] ; j ++) {
				if (d[i-res[j]] + 1 < temp) temp = d[i-res[j]] + 1;
			}
			d[i] = temp;
		}
		
		System.out.println(d[T]);
		sc.close();
	}
}