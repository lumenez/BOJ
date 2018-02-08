package test11048;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;
		int d[][];
		int a[][];
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		d = new int[n+1][m+1];
		a = new int[n+1][m+1];
		
		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= m ; j ++) {
				a[i][j] = sc.nextInt();
				d[0][j] = 0;
				a[0][j] = 0;
			}
			d[i][0] = 0;
			a[i][0] = 0;
		}

		d[0][0] = a[0][0];
		d[1][1] = a[1][1];
		
		for (int i = 1 ; i <= n ; i ++) {
			for (int j = 1 ; j <= m ; j ++) {
				d[i][j] = Math.max(d[i][j-1], d[i-1][j]);
				d[i][j] = Math.max(d[i][j], d[i-1][j-1]);	
				d[i][j] += a[i][j];
			}
		}
		
		System.out.println(d[n][m]);
		sc.close();
	}
}