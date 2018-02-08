package test2156;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int T;
		int d[];
		int a[];
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		
		d = new int[10001];
		a = new int[10001];

		for (int i = 1 ; i <= T ; i ++) {
			a[i] = sc.nextInt();
		}
		d[0] = a[0] = 0;
		d[1] = a[1];
		d[2] = a[1] + a[2];
		
		for (int i = 3 ; i <= T ; i ++) {
			d[i] = Math.max(d[i-1], d[i-2] + a[i]);
			d[i] = Math.max(d[i], d[i-3] + a[i-1] + a[i]);
		}
		
		System.out.println(d[T]);
		
		sc.close();
	}
}