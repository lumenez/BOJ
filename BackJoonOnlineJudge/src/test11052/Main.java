package test11052;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		int d[];
		int a[];
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		d = new int[T+1];
		a = new int[T+1];
		
		for (int i = 1 ; i <= T ; i ++) {
			a[i] = sc.nextInt();
		}
		d[0] = 0;
		d[1] = a[1];
		
		for (int i = 2 ; i <= T; i ++) {
			for (int j = 1 ; j <= i ; j ++) {
				d[i] = Math.max(d[i], d[i-j] + a[j]);
			}
		}
		System.out.println(d[T]);
		sc.close();
	}
}